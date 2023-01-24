package Interfase.moto;
//интерфейс может быть реализован в том числе и в анонимном классе.
public class MotoTest {
    public static void main(String[] args) {
        Moto moto = new Moto() {

            @Override
            public void ride() {
                System.out.println("ездить на мотоцикле!!!");
            }

            @Override
            public void stop() {
                System.out.println("остановить мотоцикл");
            }
        };

        moto.ride();
        moto.stop();
    }
}
