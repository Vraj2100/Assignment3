import java.util.Date;
    abstract class GeometricObject{
        String colour ;
        Date dateCreated = new Date();
        boolean filled ;
        GeometricObject(){}
        GeometricObject(String a ,boolean f)
        {
            colour = a;
            filled = f;
        }
        public String getColour() {
            return colour;
        }
        public void setColour(String colour) {
            this.colour = colour;
        }
        public Date getDateCreated() {
            return dateCreated;
        }
        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        @Override
        public String toString() {
            return "color = "+ colour + "\nCreated Date = "+dateCreated+ "\nFilled = "
                    +filled ;
        }
        abstract double getArea();
        abstract double getPerimeter();
    }


