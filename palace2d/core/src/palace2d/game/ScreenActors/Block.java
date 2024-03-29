package palace2d.game.ScreenActors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.*;

public class Block extends Actor {
    private static final int INITIAL_BLOCK_WIDTH = 578; //px

    private Sprite sprite;

    private final int height;

    public Block(Texture tex) {
        sprite = new Sprite(tex);
        height = tex.getHeight();
        trim(INITIAL_BLOCK_WIDTH);
        spritePos(sprite.getX(), sprite.getY());
    }

    public boolean isRight() {
        return this.getX() > 0;
    }

    public void trim(int width) {
        this.sprite.setSize(width, height);
    }

    public void scale(float ratio) {
        this.sprite.setSize(sprite.getWidth() * ratio, sprite.getHeight() *
                ratio);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void spritePos(float x, float y) {
        sprite.setPosition(x, y);
        setBounds(x, y, sprite.getWidth(), sprite.getHeight());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.setPosition(getX(), getY());
        sprite.draw(batch);
    }
}
