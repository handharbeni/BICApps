package illiyin.mhandharbeni.bicapps.mainpackage.bimbel.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

import illiyin.mhandharbeni.bicapps.R;
import illiyin.mhandharbeni.bicapps.mainpackage.bimbel.fragment.DataOrangTuaFragment;
import illiyin.mhandharbeni.bicapps.mainpackage.bimbel.fragment.DataPribadiFragment;
import illiyin.mhandharbeni.bicapps.mainpackage.bimbel.fragment.PembayaranFragment;
import illiyin.mhandharbeni.bicapps.mainpackage.bimbel.fragment.PilihProgramFragment;

/**
 * Created by root on 2/19/18.
 */

public class StepRegisterAdapter extends AbstractFragmentStepAdapter {
    private static final String CURRENT_STEP_POSITION_KEY = "messageResourceId";

    public StepRegisterAdapter(@NonNull FragmentManager fm, @NonNull Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        switch (position){
            case 0 :
                Bundle bDataPribadi = new Bundle();
                final DataPribadiFragment fDataPribadi = new DataPribadiFragment();
                bDataPribadi.putInt(CURRENT_STEP_POSITION_KEY, position);
                fDataPribadi.setArguments(bDataPribadi);
                return fDataPribadi;
            case 1 :
                final Bundle bDataOrangtua = new Bundle();
                final DataOrangTuaFragment fOrangTua = new DataOrangTuaFragment();
                bDataOrangtua.putInt(CURRENT_STEP_POSITION_KEY, position);
                fOrangTua.setArguments(bDataOrangtua);
                return fOrangTua;
            case 2 :
                final Bundle bPilihProgram = new Bundle();
                final PilihProgramFragment fPilihProgram = new PilihProgramFragment();
                bPilihProgram.putInt(CURRENT_STEP_POSITION_KEY, position);
                fPilihProgram.setArguments(bPilihProgram);
                return fPilihProgram;
            case 3 :
                final Bundle bPembayaran = new Bundle();
                final PembayaranFragment fPembayaran = new PembayaranFragment();
                bPembayaran.putInt(CURRENT_STEP_POSITION_KEY, position);
                fPembayaran.setArguments(bPembayaran);
                return fPembayaran;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0) int position) {
        switch (position){
            case 0:
                return new StepViewModel.Builder(context)
                        .setTitle(context.getString(R.string.placeholder_datapribadi))
                        .create();
            case 1:
                return new StepViewModel.Builder(context)
                        .setTitle(context.getString(R.string.placeholder_dataorangtua))
                        .create();
            case 2:
                return new StepViewModel.Builder(context)
                        .setTitle(context.getString(R.string.placeholder_pilihprogrambimbel))
                        .create();
            case 3:
                return new StepViewModel.Builder(context)
                        .setTitle(context.getString(R.string.placeholder_payment))
                        .create();
        }
        return null;
    }
}
