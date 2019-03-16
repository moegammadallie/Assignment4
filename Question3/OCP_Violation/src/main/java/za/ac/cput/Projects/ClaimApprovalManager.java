package za.ac.cput.Projects;

public class ClaimApprovalManager {
    public void processHealthClaim (HealthInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
/*
If I wanted to include a new VehicleInsuranceSurveyor class
*/

/*    public void processVehicleClaim (VehicleInsuranceSurveyor surveyor)
    {
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
    */
}
