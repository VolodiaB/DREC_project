package engine.window;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

/**
 * Created by USER on 20.02.2017.
 */
public class Camera {
    double x;
    double y;

    public Camera(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void translate(Graphics g, Input input){

        if(input.isKeyDown(Input.KEY_D)) x-=20;
        if(input.isKeyDown(Input.KEY_A)) x+=20;
        if(input.isKeyDown(Input.KEY_S)) y-=20;
        if(input.isKeyDown(Input.KEY_W)) y+=20;
        g.translate((float)x, (float) y);
    }
}
