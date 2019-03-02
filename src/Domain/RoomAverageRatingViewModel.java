package Domain;

public class RoomAverageRatingViewModel {

        private int room;
        private double averageRating;

        @Override
        public String toString() {
            return "RoomAverageRatingViewModel{" +
                    "stand=" + room +
                    ", averagePrice=" + averageRating +
                    '}';
        }

        public int getRoom() {
            return room;
        }

        public void setRoom(int room) {
            this.room = room;
        }

        public double getAverageRating() {
            return averageRating;
        }

        public void setAverageRating(double averageRating) {
            this.averageRating = averageRating;
        }

        public RoomAverageRatingViewModel(int room, double averageRating) {
            this.room = room;
            this.averageRating = averageRating;
        }
    }


