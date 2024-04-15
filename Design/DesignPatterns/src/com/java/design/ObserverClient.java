package com.java.design;

/*
*   +-------------------------+             +-------------------+
  |      Subject            |             |      Observer     |
  +-------------------------+             +-------------------+
  | - observers: List       |             |                   |
  +-------------------------+             +-------------------+
        |         |                               |
        |         | implements                    | implements
        |         |                               |
        |         |                               |
        |         |                               |
        |         v                               v
+------------------+                   +-------------------+
|  ConcreteSubject |                   |  ConcreteObserver |
+------------------+                   +-------------------+
| + registerObserver() |               | + update()        |
| + removeObserver()   |               +-------------------+
| + notifyObserver()  ------------------>| - name: String   |
+------------------+                   +-------------------+
                |                               |
                | uses                          |
                |                               |
                v                               |
          +----------------+                  +-----------------+
          |    Command     |                  | ConcreteCommand |
          +----------------+                  +-----------------+
          | + execute()    |                  | - action: String|
          +----------------+                  +-----------------+

*/

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(Command command);
}

class concreteObserver implements Observer{

    private String name;

    public concreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Command command) {

        System.out.println(name+" received update "+command.execute());

    }

}

interface Subject{

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(Command command);
}

class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver(Command command) {
        for(Observer observer: observers){
            new Thread(()->observer.update(command)).start();
        }

    }
}

interface Command{
    String execute();
}

class ConcreteCommand implements Command{

    private String action;

    public ConcreteCommand(String action) {
        this.action = action;
    }

    @Override
    public String execute() {
        return "Executing command:"+action;
    }
}

public class ObserverClient {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new concreteObserver("Observer 1");
        Observer observer2 = new concreteObserver("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        Command command = new ConcreteCommand("send notification");
        subject.notifyObserver(command);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        command = new ConcreteCommand("update status");
        subject.notifyObserver(command);
    }

}
