package Domain;

public class RoomValidator {

        /**
         * Validates a room.
         * @param room the room to validate.
         * @throws RuntimeException if there are validation errors.
         */
        public void validate(Room room) {

            if (room.getDays() <= 0) {
                throw new RuntimeException("The number of days cannot be 0 or negative!");
            }

            if (roomnumber.isLeftService() && car.getPrice() <= 0) {
                throw new RuntimeException("Price must be positive!");
            }
        }
    }

}
