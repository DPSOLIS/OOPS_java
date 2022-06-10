public class Book {

        private String title;
        private String autor;
        private int copies;
        private int Borrowed;


        public book() {
        }

            public Book(String title, String autor, int copies, int Borrowed) {
            this.title = title;
            this.autor = autor;
            this.copies = copies;
            this.Borrowed = Borrowed;
        }


        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getcopies() {
            return copies;
        }

        public void setcopies(int copies) {
            this.copies = copies;
        }

        public int getBorrowed() {
            return Borrowed;
        }

        public void setBorrowed(int Borrowed) {
            this.Borrowed = Borrowed;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String Title) {
            this.title = title;
        }

        public boolean Borrowed() {
            boolean Borrow = true;
            if (Borrowed < Copies) {
                Borrowed++;
            } else {
                Borrow = false;
            }
            return Borrowed;
        }


        public boolean Return() {
            boolean Returned = true;
            if (Borrowed == 0) {
                Returned = false;
            } else {
                Borrowed--;
            }
            return Returned;
        }

        @Override
        public String toString() {
            return "title: " + title + "\nautor: " + autor +
                    "\ncopies: " + copies + "\nBorrowed: " + Borrowed;
        }

    }

