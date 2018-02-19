package illiyin.mhandharbeni.bicapps.mainpackage.bimbel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;

import illiyin.mhandharbeni.bicapps.R;
import illiyin.mhandharbeni.bicapps.mainpackage.bimbel.adapter.StepRegisterAdapter;

/**
 * Created by root on 2/8/18.
 */

public class Registration extends AppCompatActivity implements StepperLayout.StepperListener {
    private StepperLayout mStepperLayout;
    private StepRegisterAdapter mStepperAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_register_bimbel_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();
        fetch_layout();
    }

    private void fetch_layout(){
        mStepperLayout = findViewById(R.id.stepperLayout);
        mStepperLayout.setBackButtonEnabled(false);
        mStepperLayout.setTabNavigationEnabled(false);
        mStepperAdapter = new StepRegisterAdapter(getSupportFragmentManager(), this);
        mStepperLayout.setAdapter(mStepperAdapter);
        mStepperLayout.setListener(this);
    }

    @Override
    public void onCompleted(View completeButton) {

    }

    @Override
    public void onError(VerificationError verificationError) {

    }

    @Override
    public void onStepSelected(int newStepPosition) {

    }

    @Override
    public void onReturn() {

    }
}
