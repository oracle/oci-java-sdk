/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.MfaTotpDevice;
import com.oracle.bmc.identity.model.MfaTotpDeviceSummary;
import com.oracle.bmc.identity.requests.CreateMfaTotpDeviceRequest;
import com.oracle.bmc.identity.requests.GetMfaTotpDeviceRequest;
import com.oracle.bmc.identity.requests.DeleteMfaTotpDeviceRequest;
import com.oracle.bmc.identity.requests.ListMfaTotpDevicesRequest;
import com.oracle.bmc.identity.responses.ListMfaTotpDevicesResponse;

/*
 * Example Class to show the usage of MFA TOTP API.
 * This sample will do the following things:
 * 1) Create MFA totp device
 * 2) Get the MFA device
 * 3) List the MFA Devices
 * 4) Delete the MFA Device
 *  Note MFA device must be activated manually via the console
 */
public class MfaTotpExample {

    public static void main(String[] args) throws Exception {
        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final String tenantId = provider.getTenantId();
        final String userId = provider.getUserId();

        Identity identityClient = new IdentityClient(provider);
        //create MFA totp device
        MfaTotpDevice device = createMfaTotpDevice(identityClient, userId);
        //get MFA totp device
        MfaTotpDeviceSummary summary =
                getMfaTotpDeviceSummary(identityClient, userId, device.getId());
        // List all MFA Totp Devices for specified user
        System.out.println("ListMfaTotpDevices for  user: " + userId + "\n");
        ListMfaTotpDevicesResponse response =
                identityClient.listMfaTotpDevices(
                        ListMfaTotpDevicesRequest.builder().userId(userId).limit(1).build());

        System.out.println("ListMfaTotpDevices Response for : " + userId + "\n");
        for (MfaTotpDeviceSummary mfaTotpDevice : response.getItems()) {
            System.out.println(mfaTotpDevice);
        }
        //delete MFA totp device
        deleteMfaTotpDevice(identityClient, userId, device.getId());
        System.out.println("Mfa totp device deleted");
    }

    public static MfaTotpDevice createMfaTotpDevice(Identity client, String userId) {
        CreateMfaTotpDeviceRequest req =
                CreateMfaTotpDeviceRequest.builder().userId(userId).build();
        try {
            MfaTotpDevice device = client.createMfaTotpDevice(req).getMfaTotpDevice();
            if (device == null) {
                throw new RuntimeException("Mfa TOTP device creation failed");
            }
            System.out.println("Mfa totp " + device + " created successfully");
            return device;
        } catch (Exception ex) {
            throw new RuntimeException(
                    "MFA Totp device creation fails with error:" + ex.getMessage());
        }
    }

    public static MfaTotpDeviceSummary getMfaTotpDeviceSummary(
            Identity client, String userId, String deviceId) {
        GetMfaTotpDeviceRequest req =
                GetMfaTotpDeviceRequest.builder().userId(userId).mfaTotpDeviceId(deviceId).build();

        try {
            MfaTotpDeviceSummary summary = client.getMfaTotpDevice(req).getMfaTotpDeviceSummary();

            System.out.println("MfaTotpDeviceId" + summary.getId() + " retrieved successfully");
            return summary;
        } catch (Exception ex) {
            throw new RuntimeException("getMfaTotpDevice fails with error:" + ex.getMessage());
        }
    }

    public static boolean deleteMfaTotpDevice(Identity client, String userId, String deviceId) {

        DeleteMfaTotpDeviceRequest deleteMfaTotpDeviceRequest =
                DeleteMfaTotpDeviceRequest.builder()
                        .userId(userId)
                        .mfaTotpDeviceId(deviceId)
                        .build();

        try {
            client.deleteMfaTotpDevice(deleteMfaTotpDeviceRequest);

            System.out.println("Mfa Totp device " + deviceId + " deleted successfully");
            return Boolean.TRUE;
        } catch (Exception ex) {
            throw new RuntimeException("Mfa totp delete fails with error:" + ex.getMessage());
        }
    }
}
