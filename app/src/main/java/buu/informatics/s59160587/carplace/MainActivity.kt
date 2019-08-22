package buu.informatics.s59160587.carplace

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car_one_button.setOnClickListener {
            addCarOne()
        }

        car_two_button.setOnClickListener {
            addCarTwo()
        }

        car_three_button.setOnClickListener {
            addCarThree()
        }

        updateOne_button.setOnClickListener {
            updateCarOne()
        }

        updateTwo_button.setOnClickListener {
            updateCarTwo()
        }

        updateThree_button.setOnClickListener {
            updateCarThree()
        }

        deleteOne_button.setOnClickListener {
            deleteCarOne()
        }

        deleteTwo_button.setOnClickListener {
            deleteCarTwo()
        }

        deleteThree_button.setOnClickListener {
            deleteCarThree()
        }

    }

    private fun updateCarOne() {
        val textPage = findViewById<TextView>(R.id.carpark_text)

        val buttonCarOne = findViewById<Button>(R.id.car_one_button)
        val buttonCarTwo = findViewById<Button>(R.id.car_two_button)
        val buttonCarThree= findViewById<Button>(R.id.car_three_button)
        //Park1
        val editCarName1 = findViewById<EditText>(R.id.carNameOne_edit)
        val editCarNum1 = findViewById<EditText>(R.id.carNumOne_edit)
        val editCarBrand1 = findViewById<EditText>(R.id.carBrandOne_edit)

        val buttonUpdate1 = findViewById<Button>(R.id.updateOne_button)
        val buttonDelete1 = findViewById<Button>(R.id.deleteOne_button)

        //Park2
        val editCarName2 = findViewById<EditText>(R.id.carNameTwo_edit)
        val editCarNum2 = findViewById<EditText>(R.id.carNumTwo_edit)
        val editCarBrand2 = findViewById<EditText>(R.id.carBrandTwo_edit)

        val buttonUpdate2 = findViewById<Button>(R.id.updateTwo_button)
        val buttonDelete2 = findViewById<Button>(R.id.deleteTwo_button)

        //Park3
        val editCarName3 = findViewById<EditText>(R.id.carNameThree_edit)
        val editCarNum3 = findViewById<EditText>(R.id.carNumThree_edit)
        val editCarBrand3 = findViewById<EditText>(R.id.carBrandThree_edit)

        val buttonUpdate3 = findViewById<Button>(R.id.updateThree_button)
        val buttonDelete3 = findViewById<Button>(R.id.deleteThree_button)

        textPage.text = "Park 1"

        buttonCarOne.visibility =  View.GONE
        buttonCarTwo.visibility = View.GONE
        buttonCarThree.visibility = View.GONE

        //Park1
        editCarName1.visibility = View.VISIBLE
        editCarNum1.visibility = View.VISIBLE
        editCarBrand1.visibility = View.VISIBLE

        buttonUpdate1.visibility = View.VISIBLE
        buttonDelete1.visibility = View.VISIBLE

        //Park2
        editCarName2.visibility = View.GONE
        editCarNum2.visibility = View.GONE
        editCarBrand2.visibility = View.GONE

        buttonUpdate2.visibility = View.GONE
        buttonDelete2.visibility = View.GONE

        //Park3
        editCarName3.visibility = View.GONE
        editCarNum3.visibility = View.GONE
        editCarBrand3.visibility = View.GONE

        buttonUpdate3.visibility = View.GONE
        buttonDelete3.visibility = View.GONE

    }

    private fun updateCarTwo() {

    }

    private fun updateCarThree() {

    }

    private fun deleteCarOne() {

    }

    private fun deleteCarTwo() {

    }

    private fun deleteCarThree() {

    }

    private fun addCarOne() {
        val textPage = findViewById<TextView>(R.id.carpark_text)

        val buttonCarOne = findViewById<Button>(R.id.car_one_button)
        val buttonCarTwo = findViewById<Button>(R.id.car_two_button)
        val buttonCarThree= findViewById<Button>(R.id.car_three_button)
        //Park1
        val editCarName1 = findViewById<EditText>(R.id.carNameOne_edit)
        val editCarNum1 = findViewById<EditText>(R.id.carNumOne_edit)
        val editCarBrand1 = findViewById<EditText>(R.id.carBrandOne_edit)

        val buttonUpdate1 = findViewById<Button>(R.id.updateOne_button)
        val buttonDelete1 = findViewById<Button>(R.id.deleteOne_button)

        //Park2
        val editCarName2 = findViewById<EditText>(R.id.carNameTwo_edit)
        val editCarNum2 = findViewById<EditText>(R.id.carNumTwo_edit)
        val editCarBrand2 = findViewById<EditText>(R.id.carBrandTwo_edit)

        val buttonUpdate2 = findViewById<Button>(R.id.updateTwo_button)
        val buttonDelete2 = findViewById<Button>(R.id.deleteTwo_button)

        //Park3
        val editCarName3 = findViewById<EditText>(R.id.carNameThree_edit)
        val editCarNum3 = findViewById<EditText>(R.id.carNumThree_edit)
        val editCarBrand3 = findViewById<EditText>(R.id.carBrandThree_edit)

        val buttonUpdate3 = findViewById<Button>(R.id.updateThree_button)
        val buttonDelete3 = findViewById<Button>(R.id.deleteThree_button)

        textPage.text = "Park 1"

        buttonCarOne.visibility =  View.GONE
        buttonCarTwo.visibility = View.GONE
        buttonCarThree.visibility = View.GONE

        //Park1
        editCarName1.visibility = View.VISIBLE
        editCarNum1.visibility = View.VISIBLE
        editCarBrand1.visibility = View.VISIBLE

        buttonUpdate1.visibility = View.VISIBLE
        buttonDelete1.visibility = View.VISIBLE

        //Park2
        editCarName2.visibility = View.GONE
        editCarNum2.visibility = View.GONE
        editCarBrand2.visibility = View.GONE

        buttonUpdate2.visibility = View.GONE
        buttonDelete2.visibility = View.GONE

        //Park3
        editCarName3.visibility = View.GONE
        editCarNum3.visibility = View.GONE
        editCarBrand3.visibility = View.GONE

        buttonUpdate3.visibility = View.GONE
        buttonDelete3.visibility = View.GONE

        val inm1 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm1.showSoftInput(editCarName1, 0)

        val inm2 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm2.showSoftInput(editCarNum1, 0)

        val inm3 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm3.showSoftInput(editCarBrand1, 0)

    }
    private fun addCarTwo() {
        val textPage = findViewById<TextView>(R.id.carpark_text)

        val buttonCarOne = findViewById<Button>(R.id.car_one_button)
        val buttonCarTwo = findViewById<Button>(R.id.car_two_button)
        val buttonCarThree= findViewById<Button>(R.id.car_three_button)
        //Park1
        val editCarName1 = findViewById<EditText>(R.id.carNameOne_edit)
        val editCarNum1 = findViewById<EditText>(R.id.carNumOne_edit)
        val editCarBrand1 = findViewById<EditText>(R.id.carBrandOne_edit)

        val buttonUpdate1 = findViewById<Button>(R.id.updateOne_button)
        val buttonDelete1 = findViewById<Button>(R.id.deleteOne_button)

        //Park2
        val editCarName2 = findViewById<EditText>(R.id.carNameTwo_edit)
        val editCarNum2 = findViewById<EditText>(R.id.carNumTwo_edit)
        val editCarBrand2 = findViewById<EditText>(R.id.carBrandTwo_edit)

        val buttonUpdate2 = findViewById<Button>(R.id.updateTwo_button)
        val buttonDelete2 = findViewById<Button>(R.id.deleteTwo_button)

        //Park3
        val editCarName3 = findViewById<EditText>(R.id.carNameThree_edit)
        val editCarNum3 = findViewById<EditText>(R.id.carNumThree_edit)
        val editCarBrand3 = findViewById<EditText>(R.id.carBrandThree_edit)

        val buttonUpdate3 = findViewById<Button>(R.id.updateThree_button)
        val buttonDelete3 = findViewById<Button>(R.id.deleteThree_button)

        textPage.text = "Park 2"

        buttonCarOne.visibility =  View.GONE
        buttonCarTwo.visibility = View.GONE
        buttonCarThree.visibility = View.GONE

        //Park1
        editCarName1.visibility = View.GONE
        editCarNum1.visibility = View.GONE
        editCarBrand1.visibility = View.GONE

        buttonUpdate1.visibility = View.GONE
        buttonDelete1.visibility = View.GONE

        //Park2
        editCarName2.visibility = View.VISIBLE
        editCarNum2.visibility = View.VISIBLE
        editCarBrand2.visibility = View.VISIBLE

        buttonUpdate2.visibility = View.VISIBLE
        buttonDelete2.visibility = View.VISIBLE

        //Park3
        editCarName3.visibility = View.GONE
        editCarNum3.visibility = View.GONE
        editCarBrand3.visibility = View.GONE

        buttonUpdate3.visibility = View.GONE
        buttonDelete3.visibility = View.GONE

        val inm1 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm1.showSoftInput(editCarName2, 0)

        val inm2 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm2.showSoftInput(editCarNum2, 0)

        val inm3 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm3.showSoftInput(editCarBrand2, 0)
    }

    private fun addCarThree(){
        val textPage = findViewById<TextView>(R.id.carpark_text)

        val buttonCarOne = findViewById<Button>(R.id.car_one_button)
        val buttonCarTwo = findViewById<Button>(R.id.car_two_button)
        val buttonCarThree= findViewById<Button>(R.id.car_three_button)
        //Park1
        val editCarName1 = findViewById<EditText>(R.id.carNameOne_edit)
        val editCarNum1 = findViewById<EditText>(R.id.carNumOne_edit)
        val editCarBrand1 = findViewById<EditText>(R.id.carBrandOne_edit)

        val buttonUpdate1 = findViewById<Button>(R.id.updateOne_button)
        val buttonDelete1 = findViewById<Button>(R.id.deleteOne_button)

        //Park2
        val editCarName2 = findViewById<EditText>(R.id.carNameTwo_edit)
        val editCarNum2 = findViewById<EditText>(R.id.carNumTwo_edit)
        val editCarBrand2 = findViewById<EditText>(R.id.carBrandTwo_edit)

        val buttonUpdate2 = findViewById<Button>(R.id.updateTwo_button)
        val buttonDelete2 = findViewById<Button>(R.id.deleteTwo_button)

        //Park3
        val editCarName3 = findViewById<EditText>(R.id.carNameThree_edit)
        val editCarNum3 = findViewById<EditText>(R.id.carNumThree_edit)
        val editCarBrand3 = findViewById<EditText>(R.id.carBrandThree_edit)

        val buttonUpdate3 = findViewById<Button>(R.id.updateThree_button)
        val buttonDelete3 = findViewById<Button>(R.id.deleteThree_button)

        textPage.text = "Park 3"

        buttonCarOne.visibility =  View.GONE
        buttonCarTwo.visibility = View.GONE
        buttonCarThree.visibility = View.GONE

        //Park1
        editCarName1.visibility = View.GONE
        editCarNum1.visibility = View.GONE
        editCarBrand1.visibility = View.GONE

        buttonUpdate1.visibility = View.GONE
        buttonDelete1.visibility = View.GONE

        //Park2
        editCarName2.visibility = View.GONE
        editCarNum2.visibility = View.GONE
        editCarBrand2.visibility = View.GONE

        buttonUpdate2.visibility = View.GONE
        buttonDelete2.visibility = View.GONE

        //Park3
        editCarName3.visibility = View.VISIBLE
        editCarNum3.visibility = View.VISIBLE
        editCarBrand3.visibility = View.VISIBLE

        buttonUpdate3.visibility = View.VISIBLE
        buttonDelete3.visibility = View.VISIBLE

        val inm1 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm1.showSoftInput(editCarName3, 0)

        val inm2 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm2.showSoftInput(editCarNum3, 0)

        val inm3 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inm3.showSoftInput(editCarBrand3, 0)
    }

}
