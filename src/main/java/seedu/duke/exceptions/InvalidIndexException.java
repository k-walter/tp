package seedu.duke.exceptions;

//@@author xieyaoyue
public class InvalidIndexException extends DukeException {
    @Override
    public String toString() {
        return "Sorry, the index is invalid. Please re-enter the index.";
    }
}
