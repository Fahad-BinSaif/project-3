package Important;
// in slide (58).
public class Librarycard {
//student owner of this card
private Student owner;
//number of books borrowed
private int borrowCnt; 

//numOfBooks are checked out
public void checkOut(int numOfBooks) {
    borrowCnt = borrowCnt + numOfBooks;
}

//Returns the name of the owner of this card
public String getOwnerName( ) {
    return owner.getName( );
}

//Returns the number of books borrowed
public int getNumberOfBooks( ) {
    return borrowCnt;
}

//Sets the owner of this card to student
public void setOwner(Student stud) {
    owner = stud;
}    

//Returns the string representation of this card
public String toString( ) {
  return "owner name : "+owner.getName() +"\n"+"Email : "+owner.getEmail()+"\n"+"BooksBorrowd : "+borrowCnt ;
}      
}

