
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

// You should **not** update any call signatures in this file
// only modify the body of each function

class Conversation implements ConversationRequirements {

  // Attributes 
  ArrayList<String> transcript; // a modifiable list containing the conversation
  String [] canned_responses = {"Okay", "That's interesting!", "Hmm..."}; //  an unmodifiable list with responses
  /**
   * Constructor 
   */
  Conversation() {
    // initialize the constructor
    this.transcript = new ArrayList<String>(); 
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    Scanner input = new Scanner(System.in); // only one scanner needed

    // Ask user to input the number of rounds they want to run 
    System.out.println("Number of rounds:");
    int rounds = input.nextInt();

    // Print a statement, save that statement in transcript, and start the conversation
    System.out.println("Hi there! What's on your mind?");
    this.transcript.add("Hi there! What's on your mind?");
    // get user response and turn them into a string
    String userresponse1 = input.nextLine(); 


    // Create a for loop with the number of rounds required for the dialogue between the chat and user,
    // 1. take the user input
    // 2. save that input into the transcript
    // 3. call the method respond to generate the response and save this response in the transcript
    for(int i=0; i< rounds; i++){
        String userresponse = input.nextLine();
        this.transcript.add(userresponse);
        String response_to_user = respond(userresponse);
        System.out.println(response_to_user);
        this.transcript.add(response_to_user);
        
      } 
    // print and save goodbye message
    System.out.println("See ya!");
    this.transcript.add("See ya!");
    }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {
    // From the array list transcript, turn them into a string with old elements now separated by the new line character.
    String new_transcript = String.join("\r\n", this.transcript);
    // print the transcript of conversation
    System.out.print(new_transcript);

  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    // create the returnString
    String returnString = "";
    // create a list to prepare for the array by turning the characters into all lowercase, and then split them through space
    String [] prep_arr = inputString.toLowerCase().split(" ");
    // create an array list called arr that has the elements of prep_arr
    ArrayList<String> arr = new ArrayList<>();
    for (int i = 0; i < prep_arr.length; i++){
      arr.add(prep_arr[i]);
    }
    // create a random object
    Random rand = new Random();

    // if the elements in arr contains the mirrored words
    if (arr.contains("i") || arr.contains("me") || arr.contains("you")
    || arr.contains("am") || arr.contains("my") || arr.contains("your")){
      // run a loop to check each elements inside arr and replace them accordingly with the mirrored word
      for (int i = 0; i < prep_arr.length; i++){
        if ("i".equals(prep_arr[i]) || "me".equals(prep_arr[i])){
          arr.replaceAll(s -> s.replace("i", "you"));
          arr.replaceAll(s -> s.replace("me","you"));
        } else if ("you".equals(prep_arr[i])){
          arr.replaceAll(s -> s.replace("you","I"));
        } else if ("am".equals(prep_arr[i])){
          arr.replaceAll(s -> s.replace("am","are"));
        } else if ("my".equals(prep_arr[i])){
          arr.replaceAll(s -> s.replace("my","your"));
        } else if ("your".equals(prep_arr[i])){
          arr.replaceAll(s -> s.replace("your","my"));
        }
      returnString = String.join(" ", arr);
      returnString = returnString + "?";
      }
    }
    // if there is no mirrored word inside arr
    else {
      // the returnString would be a randomized canned response
        returnString = this.canned_responses[rand.nextInt(this.canned_responses.length)];
      }
    
    return returnString;
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
