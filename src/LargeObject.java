import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LargeObject extends GameObject implements PhysicBody {

    Vector2D position;
    BoxCollider boxCollider;
    ImageRenderer renderer;
    Random random;
    boolean isCaught;
    boolean isAlive;



    public LargeObject() {
        random = new Random();
        this.position = new Vector2D(random.nextInt(1650), random.nextInt(700));
        this.renderer = new ImageRenderer("resources/images/circle.png", 40, 40);
        this.boxCollider = new BoxCollider( 40,40 );
        this.boxCollider.position.set((int)this.position.x - 20, (int) this.position.y - 20);
        this.isCaught = false;
        this.isAlive = true;
    }

    @Override
    public void run() {
        if (isCaught) {
            Anchor anchor = GameObjectManager.instance.findAnchor();
            if (!anchor.isCatching) {
                this.isAlive = false;
            }
            else this.position.set(anchor.position);


        }
    }

    public void getHit() {
        this.isCaught = true;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void render(Graphics graphics) {
        if (this.isAlive) {
            this.renderer.render(graphics, this.position);
        }
    }


}
