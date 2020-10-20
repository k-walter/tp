package seedu.duke.command;

import org.junit.jupiter.api.Test;
import seedu.duke.SpendingList;
import seedu.duke.Storage;
import seedu.duke.Ui;
import seedu.duke.exceptions.InvalidStorageFileExtensionException;
import seedu.duke.exceptions.InvalidStorageFilePathException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClearCommandTest {

    @Test
    void execute_clearIndex() throws InvalidStorageFileExtensionException,
            InvalidStorageFilePathException, IOException {
        ClearCommand clearCommand = new ClearCommand(false, 1);
        Storage storage = new Storage();
        SpendingList spendingList = new SpendingList(storage);
        Ui ui = new Ui();
        spendingList.addItem("buy chicken rice", "$", 3.0);
        spendingList.addItem("buy sushi", "$", 5.1);
        clearCommand.execute(spendingList, ui);
        assertEquals(spendingList.getListSize(), 1);
    }

    @Test
    void execute_clearAll() throws InvalidStorageFileExtensionException, InvalidStorageFilePathException, IOException {
        ClearCommand clearCommand = new ClearCommand(true, 0);
        Storage storage = new Storage();
        SpendingList spendingList = new SpendingList(storage);
        Ui ui = new Ui();
        spendingList.addItem("buy chicken rice", "$", 3.0);
        spendingList.addItem("buy sushi", "$", 5.1);
        clearCommand.execute(spendingList, ui);
        assertEquals(spendingList.getListSize(), 0);
    }

}