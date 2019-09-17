/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.database.model.BackupDestinationDetails;

public class BackupDestinationHelper {

    public static BackupDestinationDetails backupDestinationDetailsCreater(
            String type, String backupdestinationOcid, String vpcUser, String vpcPassword)
            throws Exception {
        BackupDestinationDetails backupDestinationDetails = null;

        switch (type) {
            case "ZDLRA":
                backupDestinationDetails =
                        BackupDestinationDetails.builder()
                                .id(backupdestinationOcid)
                                .type(BackupDestinationDetails.Type.RecoveryAppliance)
                                .vpcUser(vpcUser)
                                .vpcPassword(vpcPassword)
                                .build();
                break;
            case "NFS":
                backupDestinationDetails =
                        BackupDestinationDetails.builder()
                                .id(backupdestinationOcid)
                                .type(BackupDestinationDetails.Type.Nfs)
                                .build();
                break;
            case "ObjectStorage":
                backupDestinationDetails =
                        BackupDestinationDetails.builder()
                                .id(backupdestinationOcid)
                                .type(BackupDestinationDetails.Type.ObjectStore)
                                .build();
                break;
            case "Local":
                backupDestinationDetails =
                        BackupDestinationDetails.builder()
                                .id(backupdestinationOcid)
                                .type(BackupDestinationDetails.Type.Local)
                                .build();
                break;
            default:
                throw new Exception(
                        "Enter a valid type value from NFS, ZDLRA, Local, ObjectStorage");
        }

        return backupDestinationDetails;
    }
}
