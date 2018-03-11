/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainer.model;

/**
 *
 * @author bankcom
 */
public class Exercise {

    private TreadMill treadmill;
    private Ellptical elliptical;

    public Exercise() {
        this.treadmill = new TreadMill();
        this.elliptical = new Ellptical();
    }

    public int courseA() {
// หารสองเพราะว่ามันแค่ 30 นาที
        return treadmill.helpMetabolism() + (elliptical.helpMetabolism() / 2);
    }

    public int courseB() {
        //ที่คูณ 1.5 เพราะว่ามัน 1 ชั่วโมงครึ่ง
        return (int) ((treadmill.helpMetabolism() * 1.5) + sitUp(30));
    }

    public int sitUp(int amount) {
        return (int) amount / 2;
    }

    public int playTreadmill(int time) {

        double kcal = (treadmill.helpMetabolism() * time) / 60;

        return (int) kcal;
    }

    public int playElliptical(int time) {

        double kcal = (elliptical.helpMetabolism() * time) / 60;
        return (int) kcal;
    }

}
