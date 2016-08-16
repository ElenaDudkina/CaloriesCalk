package calculatorcalories.hfad.com.thebestcalculatorcalories;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculatorCalories extends AppCompatActivity {


    EditText editText;
    EditText editText2;
    EditText editText3;
    TextView textView;
    Button button;

    public static final int MAIN_MEN = (int) 88.36;
    public static final int MAIN_WOMEN = (int) 447.6;
    public static final int WEIGHT_MEN = (int) 13.4;
    public static final int WEIGHT_WOMEN= (int) 9.2;
    public static final int HEIGHT_MEN = (int) 4.8;
    public static final int HEIGHT_WOMEN = (int) 3.1;
    public static final int AGE_MEN= (int) 5.7;
    public static final int AGE_WOMEN= (int) 4.3;

    public static final int MIN_ACTIVITY = (int) 1.2;
    public static final int LOW_ACTIVITY = (int) 1.375;
    public static final int AVERAGE_ACTIVITY = (int) 1.55;
    public static final int TALL_ACTIVITY = (int) 1.725;
    public static final int SUPREME_ACTIVITY = (int) 1.9;

    public static final int INCREASE = (int) 1.2;
    public static final int DECREASE = (int) 0.8;
    public static final int QUICK_DECREASE = (int) 0.4;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_calories);

        editText  = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                }
        });



        Spinner spinner = (Spinner) findViewById(R.id.активность_spinner);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Активность, android.R.layout.simple_spinner_item);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);



        Spinner spinner1 = (Spinner) findViewById(R.id.цель_spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Цель, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);



        Spinner spinner2 = (Spinner) findViewById(R.id.пол_spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Пол, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

    }






}
