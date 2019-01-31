/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.announcementsservice.Announcement;
import com.oracle.bmc.announcementsservice.AnnouncementClient;
import com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails;
import com.oracle.bmc.announcementsservice.model.BaseAnnouncement;
import com.oracle.bmc.announcementsservice.requests.GetAnnouncementRequest;
import com.oracle.bmc.announcementsservice.requests.GetAnnouncementUserStatusRequest;
import com.oracle.bmc.announcementsservice.requests.ListAnnouncementsRequest;
import com.oracle.bmc.announcementsservice.requests.UpdateAnnouncementUserStatusRequest;
import com.oracle.bmc.announcementsservice.responses.GetAnnouncementResponse;
import com.oracle.bmc.announcementsservice.responses.GetAnnouncementUserStatusResponse;
import com.oracle.bmc.announcementsservice.responses.ListAnnouncementsResponse;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;

import java.util.Date;

public class AnnouncementsServiceExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    // Announcements Service doesn't expose a create api publicly, you will need to refer to an existing announcement to run the example
    private static final String ANNOUNCEMENT_ID = "<announcement_id>";

    // The compartment id must be the tenancy id
    private static final String COMPARTMENT_ID = "<compartment_id>";

    public static void main(String[] args) throws Exception {

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        Announcement client = new AnnouncementClient(provider);

        GetAnnouncementRequest getReq =
                GetAnnouncementRequest.builder().announcementId(ANNOUNCEMENT_ID).build();
        GetAnnouncementResponse getResp = client.getAnnouncement(getReq);

        // List announcements
        // Default page size of 100
        ListAnnouncementsRequest defaultReq = getBaseListReq().build();
        ListAnnouncementsResponse defaultResp = client.listAnnouncements(defaultReq);

        // Pagination
        ListAnnouncementsRequest pageOneReq = getBaseListReq().limit(10).build();
        ListAnnouncementsResponse pageOneResp = client.listAnnouncements(pageOneReq);
        ListAnnouncementsRequest pageTwoReq =
                getBaseListReq().limit(10).page(pageOneResp.getOpcNextPage()).build();
        ListAnnouncementsResponse pageTwoResp = client.listAnnouncements(pageTwoReq);

        // Filter by action recommended announcement-type
        ListAnnouncementsRequest typeFilterReq =
                getBaseListReq()
                        .announcementType(
                                BaseAnnouncement.AnnouncementType.ActionRecommended.getValue())
                        .build();
        ListAnnouncementsResponse typeFilterResp = client.listAnnouncements(typeFilterReq);

        // Filter by active lifecycle state
        ListAnnouncementsRequest lifecycleFilterReq =
                getBaseListReq()
                        .lifecycleState(ListAnnouncementsRequest.LifecycleState.Active)
                        .build();
        ListAnnouncementsResponse lifecycleFilterResp =
                client.listAnnouncements(lifecycleFilterReq);

        // Filter by active banners
        ListAnnouncementsRequest filterBannerReq = getBaseListReq().isBanner(true).build();
        ListAnnouncementsResponse filterBannerResp = client.listAnnouncements(filterBannerReq);

        // Sort by reference ticket number
        ListAnnouncementsRequest sortByReq =
                getBaseListReq()
                        .sortBy(ListAnnouncementsRequest.SortBy.ReferenceTicketNumber)
                        .build();
        ListAnnouncementsResponse sortByResp = client.listAnnouncements(sortByReq);

        // Sort by default order, time created, in descending order
        ListAnnouncementsRequest sortOrderReq =
                getBaseListReq().sortOrder(ListAnnouncementsRequest.SortOrder.Desc).build();
        ListAnnouncementsResponse sortOrderResp = client.listAnnouncements(sortOrderReq);

        // Filter time one to be at least the current time
        ListAnnouncementsRequest timeOneMinReq =
                getBaseListReq().timeOneEarliestTime(new Date()).build();
        ListAnnouncementsResponse timeOneMinResp = client.listAnnouncements(timeOneMinReq);

        // Filter time one to be at most the current time
        ListAnnouncementsRequest timeOneMaxReq =
                getBaseListReq().timeOneLatestTime(new Date()).build();
        ListAnnouncementsResponse timeOneMaxResp = client.listAnnouncements(timeOneMaxReq);

        getAnnouncementUserStatus(client, ANNOUNCEMENT_ID);
        // Update user's announcement acknowledgement time to now
        updateAnnouncementUserStatus(client, ANNOUNCEMENT_ID, new Date());
        getAnnouncementUserStatus(client, ANNOUNCEMENT_ID);
        // Cleanup status
        updateAnnouncementUserStatus(client, ANNOUNCEMENT_ID, null);
    }

    private static ListAnnouncementsRequest.Builder getBaseListReq() {
        return ListAnnouncementsRequest.builder().compartmentId(COMPARTMENT_ID);
    }

    private static void getAnnouncementUserStatus(Announcement client, String announcementId) {
        GetAnnouncementUserStatusRequest request =
                GetAnnouncementUserStatusRequest.builder().announcementId(announcementId).build();
        GetAnnouncementUserStatusResponse response = client.getAnnouncementUserStatus(request);
    }

    private static void updateAnnouncementUserStatus(
            Announcement client, String annoucementId, Date timeAcknowledged) {
        AnnouncementUserStatusDetails announcementUserStatusDetails =
                AnnouncementUserStatusDetails.builder()
                        .userStatusAnnouncementId(
                                annoucementId) // The announcement id is redundantly specified here on purpose
                        .timeAcknowledged(timeAcknowledged)
                        .build();
        UpdateAnnouncementUserStatusRequest request =
                UpdateAnnouncementUserStatusRequest.builder()
                        .announcementId(annoucementId)
                        .statusDetails(announcementUserStatusDetails)
                        .build();
        client.updateAnnouncementUserStatus(request);
        // There is no response body, a 200 indicates success
    }
}
