package com.java.objects.classes.encapsulation;

public class BookEncapsulated {

  private int pageNum;

  // A Class is encapsulated when the data of the object is protected from other classes by using 'private'. This means you cannot use object.field to make any change to the object. But this is not complete:
  // - You need to assign public getters and setters for indirectly access control to the object's (instantiated) fields.

  // Constructor:
  public BookEncapsulated() {
  }

  public BookEncapsulated(int pageNum) {
    this.pageNum = pageNum;
  }

  // Getters:
  public int getPageNum() {
    return this.pageNum;
  }

  // Setters:
  public void setPageNum(int pageNum) {
    if (pageNum > 0) {
      this.pageNum = pageNum;
    } else {
      System.out.println("Please set a page number above 0");
    }
  }

  @Override
  public String toString() {
    return "BookEncapsulated [pageNum=" + pageNum + "]";
  }
}
