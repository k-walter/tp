package seedu.duke.exceptions;

//@@author killingbear999
public class EmptyCommandException extends DukeException {
    @Override
    public String toString() {
        return "Sorry, please input at least one of the areas you wanna edit.";
    }
}
