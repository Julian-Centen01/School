

import java.util.ArrayList;
import java.util.Scanner;

public class Midterm_Program {
    public static void main (String[] args)
    {
        //array of objects declared
        ArrayList<ToDoList> List = new ArrayList<ToDoList>();
        Scanner scan = new Scanner(System.in);
        //local variables declared
        String titleHold;
        String descriptionHold;
        String command;
        int y = 0;
        boolean exit = false;

        //indefinite access to list until exit command is issued
        while (!exit)
        {
            //Output of list of tasks (title ONLY)
            System.out.println("Current to-do list:");
            for (int x = 0; x < List.size(); x++)
            {
                System.out.println((x + 1) + " " + List.get(x).title());
            }

            //prompt for command issuing. all commands are the words listed below
            System.out.println("Please input any of the listed commands by name: ");
            System.out.println("1: add");
            //commands are hidden and disabled if list is empty
            if (List.size() != 0)
            {
                System.out.println("2: display");
                System.out.println("3: complete");
                System.out.println("4: remove");
            }
            //final command adjusts accordingly
            if (List.size() == 0)
                System.out.print("2: ");
            else
                System.out.print("5: ");
            System.out.println("exit");

            command = scan.nextLine();

            //command 1: prompts user to add a title and description of task, adds to the array
            if (command.equals("add"))
            {
                System.out.print("Please title your task: ");
                titleHold = scan.nextLine();
                System.out.print("Please provide a description: ");
                descriptionHold = scan.nextLine();
                List.add(new ToDoList(titleHold, descriptionHold));
            }
            //command 2: prompts user for specific task by number. Displays task content
            else if (command.equals("display") && List.size() != 0)
            {
                System.out.print("Pick the number of desired task: ");
                y = scan.nextInt() - 1;
                scan.nextLine();
                //failsafe against out of bound commands
                if (y >= List.size())
                    System.out.println("Error, task not found. Returning to command prompt...");
                else
                {
                    System.out.println("Title: " + List.get(y).title());
                    System.out.println("Description: " + List.get(y).description());
                    System.out.println("Time Started: " + List.get(y).timeStart());

                    //check for completion status
                    if (!(List.get(y).taskStatus()))
                        System.out.println("Currently Incomplete");
                    else
                        System.out.println("Completed");

                    if (List.get(y).timeFinish() != 0) {
                        System.out.println("Time Completed: " + List.get(y).timeFinish());
                    }
                }
            }
            //command 3: User selects a task to mark as complete, cannot be undone unless removed and recreated
            else if (command.equals("complete") && List.size() != 0)
            {
                System.out.print("Pick the number of task to complete: ");
                y = scan.nextInt() - 1;
                scan.nextLine();

                //identical failsafe to command 2
                if (y >= List.size())
                    System.out.println("Error, task not found. Returning to command prompt...");
                else
                {
                    System.out.println("Title: " + List.get(y).title());
                    System.out.println("Description: " + List.get(y).description());

                    //prompt for verification by user to complete task
                    System.out.println("Confirm complete? [Y/N] ");
                    command = scan.nextLine();

                    //selected task is labeled complete. unable to immediately verify completion due to display errors
                    if (command.equals("Y"))
                        List.get(y).complete();
                }
            }
            //command 4, prompts a user to remove a task from the list
            else if (command.equals("remove") && List.size() != 0)
            {
                System.out.print("Pick the number of task to remove: ");
                y = scan.nextInt() - 1;
                scan.nextLine();

                //identical failsafe to previous commands
                if (y >= List.size())
                    System.out.println("Error, task not found. Returning to command prompt...");
                else
                {
                    System.out.println("Title: " + List.get(y).title());
                    System.out.println("Description: " + List.get(y).description());

                    //similar verification prompt for removal
                    System.out.println("Confirm removal? [Y/N] ");
                    command = scan.nextLine();
                    if (command.equals("Y"))
                        List.remove(y);
                }
            }
            //command 5: simple exit command
            else if (command.equals("exit"))
                exit = true;
            //failsafe against foreign commands
            else
                System.out.println("Unknown command");
        }
    }
}
