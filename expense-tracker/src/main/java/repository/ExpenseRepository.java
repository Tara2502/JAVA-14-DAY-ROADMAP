package repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Expense;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpenseRepository {
    private final ObjectMapper mapper=new ObjectMapper();
    private final File file=new File("expenses.json");
    /**
     * Saves all expenses to the JSON file.
     */
    public void saveExpenses(List<Expense> expenses)throws IOException{
        mapper.writeValue(file,expenses);
    }
    public List<Expense> loadExpenses() throws IOException{
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }
return mapper.readValue(file, new TypeReference<List<Expense>>() {
});
    }
}
