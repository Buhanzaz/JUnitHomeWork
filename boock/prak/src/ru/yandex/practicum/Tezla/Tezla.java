package ru.yandex.practicum.Tezla;

public class Tezla extends Automobile{
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
        acceleration = 100;
    }

    public void accelerateByAutopilot() {
        if (autoPilotMaxSpeed > speed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
        // исправьте метод для ускорения при автопилоте
    }
    @Override
    public void accelerate(){
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }
    // переопределите метод для ускорения
    @Override
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
        if (speed <= 0){
            speed = 0;
        }
    }
    // переопределите метод для торможения
}
