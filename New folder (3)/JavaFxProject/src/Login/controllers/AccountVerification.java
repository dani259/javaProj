package Login.controllers;

import java.util.ArrayList;

public class AccountVerification {

    private ArrayList<ManufacturerClass> arrayM = new ArrayList<>();
    private ArrayList<CustomerClass> arrayC = new ArrayList<>();

    public boolean AddM(ManufacturerClass m) {
        if (arrayM.size() != 0) {

            for (int i = 0; i < arrayM.size(); i++) {
                if (m.equals(arrayM.get(i))) {
                    return false;
                }
            }
        }

            arrayM.add(m);



        return true;
    }

    public boolean AddC(CustomerClass c)
    {
        if (arrayC.size() != 0) {

            for (int i = 0; i < arrayC.size(); i++) {
                if (c.equals(arrayC.get(i))) {
                    return false;
                }
            }
        }

            arrayC.add(c);
        return true;

    }



}
