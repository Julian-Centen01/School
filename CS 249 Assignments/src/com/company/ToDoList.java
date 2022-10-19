


class ToDoList {
    //Components of the class declared
    String title;
    String description;
    long timeStart;
    long timeFinish;
    Boolean complete;

    ToDoList()
    {
        //all values set to null
        title = "";
        description = "";
        timeStart = 0;
        timeFinish = 0;
        complete = null;
    }
    //declaration of title, description, completion status, and time of creation
    ToDoList(String Ntitle, String Ndescription)
    {
        title = Ntitle;
        description = Ndescription;
        timeStart = System.currentTimeMillis();
        complete = false;
    }

    //basic function to mark task objects as complete
    void complete ()
    {
        complete = true;

        timeFinish = System.currentTimeMillis();
    }

    //outputs for each object component
    String title() { return title; }
    String description() { return description; }
    long timeStart() { return timeStart; }
    long timeFinish() { return timeFinish; }
    Boolean taskStatus()  { return complete; }
}
