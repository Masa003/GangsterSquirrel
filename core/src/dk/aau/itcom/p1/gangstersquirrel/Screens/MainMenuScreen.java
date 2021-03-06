package dk.aau.itcom.p1.gangstersquirrel.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import dk.aau.itcom.p1.gangstersquirrel.MainGameClass;

public class MainMenuScreen implements Screen {

    final MainGameClass game;

    private static final int PLAY_BUTTON_WIDTH = 300;
    private static final int PLAY_BUTTON_HEIGHT = 150;
    private static final int EXIT_BUTTON_WIDTH = 330;
    private static final int EXIT_BUTTON_HEIGHT = 150;

    Texture playButtonActive;
    Texture playButtonInactive;
    Texture exitButtonActive;
    Texture exitButtonInactive;

    public MainMenuScreen(MainGameClass game) {
        this.game = game;

        playButtonActive = new Texture("play_button_active.png");
        playButtonInactive = new Texture("play_button_inactive.png");
        exitButtonActive = new Texture("exit_button_active.png");
        exitButtonInactive = new Texture("exit_button_inactive.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();

        int screenMiddleX = (MainGameClass.WIDTH / 2) - (PLAY_BUTTON_WIDTH / 2);
        int screenMiddleY = (MainGameClass.HEIGHT / 2) - (PLAY_BUTTON_HEIGHT / 2);
        if (Gdx.input.getX() < screenMiddleX + PLAY_BUTTON_WIDTH && Gdx.input.getX() > screenMiddleX && Gdx.input.getY() < screenMiddleY + PLAY_BUTTON_HEIGHT && Gdx.input.getY() > screenMiddleY) {
            game.batch.draw(playButtonActive, screenMiddleX, screenMiddleY, PLAY_BUTTON_WIDTH, PLAY_BUTTON_HEIGHT);
            if (Gdx.input.isTouched()) {
                game.setScreen(new PlayScreen(game));
                dispose();
            }
        } else {
            game.batch.draw(playButtonInactive, screenMiddleX, screenMiddleY, PLAY_BUTTON_WIDTH, PLAY_BUTTON_HEIGHT);
        }

        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
