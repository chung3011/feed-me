package scene;

import Base.GameObjectManager;
import Base.Vector2D;
import Constant.Constant;
import Game.Background.LevelOneBackground;
import Game.Button;
import Game.Background.IntroBackGround;

public class LevelOneScene implements Scene {
    @Override
    public void init() {

        GameObjectManager.instance.recycle(LevelOneBackground.class);
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }
}
