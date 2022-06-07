/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplianceExportJob.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplianceExportJob {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "bucketName",
        "displayName",
        "creationTime",
        "lifecycleState",
        "lifecycleStateDetails",
        "applianceSerialNumber",
        "applianceDecryptionPassphrase",
        "applianceDeliveryVendor",
        "applianceDeliveryTrackingNumber",
        "applianceReturnDeliveryTrackingNumber",
        "sendingSecurityTie",
        "receivingSecurityTie",
        "prefix",
        "rangeStart",
        "rangeEnd",
        "numberOfObjects",
        "totalSizeInBytes",
        "firstObject",
        "lastObject",
        "nextObject",
        "manifestFile",
        "manifestMd5",
        "bucketAccessPolicies",
        "customerShippingAddress",
        "freeformTags",
        "definedTags"
    })
    public ApplianceExportJob(
            String id,
            String compartmentId,
            String bucketName,
            String displayName,
            java.util.Date creationTime,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            String applianceSerialNumber,
            String applianceDecryptionPassphrase,
            String applianceDeliveryVendor,
            String applianceDeliveryTrackingNumber,
            String applianceReturnDeliveryTrackingNumber,
            String sendingSecurityTie,
            String receivingSecurityTie,
            String prefix,
            String rangeStart,
            String rangeEnd,
            String numberOfObjects,
            String totalSizeInBytes,
            String firstObject,
            String lastObject,
            String nextObject,
            String manifestFile,
            String manifestMd5,
            java.util.List<String> bucketAccessPolicies,
            ShippingAddress customerShippingAddress,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.bucketName = bucketName;
        this.displayName = displayName;
        this.creationTime = creationTime;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.applianceSerialNumber = applianceSerialNumber;
        this.applianceDecryptionPassphrase = applianceDecryptionPassphrase;
        this.applianceDeliveryVendor = applianceDeliveryVendor;
        this.applianceDeliveryTrackingNumber = applianceDeliveryTrackingNumber;
        this.applianceReturnDeliveryTrackingNumber = applianceReturnDeliveryTrackingNumber;
        this.sendingSecurityTie = sendingSecurityTie;
        this.receivingSecurityTie = receivingSecurityTie;
        this.prefix = prefix;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.numberOfObjects = numberOfObjects;
        this.totalSizeInBytes = totalSizeInBytes;
        this.firstObject = firstObject;
        this.lastObject = lastObject;
        this.nextObject = nextObject;
        this.manifestFile = manifestFile;
        this.manifestMd5 = manifestMd5;
        this.bucketAccessPolicies = bucketAccessPolicies;
        this.customerShippingAddress = customerShippingAddress;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceSerialNumber")
        private String applianceSerialNumber;

        public Builder applianceSerialNumber(String applianceSerialNumber) {
            this.applianceSerialNumber = applianceSerialNumber;
            this.__explicitlySet__.add("applianceSerialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceDecryptionPassphrase")
        private String applianceDecryptionPassphrase;

        public Builder applianceDecryptionPassphrase(String applianceDecryptionPassphrase) {
            this.applianceDecryptionPassphrase = applianceDecryptionPassphrase;
            this.__explicitlySet__.add("applianceDecryptionPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryVendor")
        private String applianceDeliveryVendor;

        public Builder applianceDeliveryVendor(String applianceDeliveryVendor) {
            this.applianceDeliveryVendor = applianceDeliveryVendor;
            this.__explicitlySet__.add("applianceDeliveryVendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryTrackingNumber")
        private String applianceDeliveryTrackingNumber;

        public Builder applianceDeliveryTrackingNumber(String applianceDeliveryTrackingNumber) {
            this.applianceDeliveryTrackingNumber = applianceDeliveryTrackingNumber;
            this.__explicitlySet__.add("applianceDeliveryTrackingNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceReturnDeliveryTrackingNumber")
        private String applianceReturnDeliveryTrackingNumber;

        public Builder applianceReturnDeliveryTrackingNumber(
                String applianceReturnDeliveryTrackingNumber) {
            this.applianceReturnDeliveryTrackingNumber = applianceReturnDeliveryTrackingNumber;
            this.__explicitlySet__.add("applianceReturnDeliveryTrackingNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sendingSecurityTie")
        private String sendingSecurityTie;

        public Builder sendingSecurityTie(String sendingSecurityTie) {
            this.sendingSecurityTie = sendingSecurityTie;
            this.__explicitlySet__.add("sendingSecurityTie");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("receivingSecurityTie")
        private String receivingSecurityTie;

        public Builder receivingSecurityTie(String receivingSecurityTie) {
            this.receivingSecurityTie = receivingSecurityTie;
            this.__explicitlySet__.add("receivingSecurityTie");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
        private String rangeStart;

        public Builder rangeStart(String rangeStart) {
            this.rangeStart = rangeStart;
            this.__explicitlySet__.add("rangeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
        private String rangeEnd;

        public Builder rangeEnd(String rangeEnd) {
            this.rangeEnd = rangeEnd;
            this.__explicitlySet__.add("rangeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfObjects")
        private String numberOfObjects;

        public Builder numberOfObjects(String numberOfObjects) {
            this.numberOfObjects = numberOfObjects;
            this.__explicitlySet__.add("numberOfObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInBytes")
        private String totalSizeInBytes;

        public Builder totalSizeInBytes(String totalSizeInBytes) {
            this.totalSizeInBytes = totalSizeInBytes;
            this.__explicitlySet__.add("totalSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("firstObject")
        private String firstObject;

        public Builder firstObject(String firstObject) {
            this.firstObject = firstObject;
            this.__explicitlySet__.add("firstObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastObject")
        private String lastObject;

        public Builder lastObject(String lastObject) {
            this.lastObject = lastObject;
            this.__explicitlySet__.add("lastObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextObject")
        private String nextObject;

        public Builder nextObject(String nextObject) {
            this.nextObject = nextObject;
            this.__explicitlySet__.add("nextObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("manifestFile")
        private String manifestFile;

        public Builder manifestFile(String manifestFile) {
            this.manifestFile = manifestFile;
            this.__explicitlySet__.add("manifestFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("manifestMd5")
        private String manifestMd5;

        public Builder manifestMd5(String manifestMd5) {
            this.manifestMd5 = manifestMd5;
            this.__explicitlySet__.add("manifestMd5");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketAccessPolicies")
        private java.util.List<String> bucketAccessPolicies;

        public Builder bucketAccessPolicies(java.util.List<String> bucketAccessPolicies) {
            this.bucketAccessPolicies = bucketAccessPolicies;
            this.__explicitlySet__.add("bucketAccessPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplianceExportJob build() {
            ApplianceExportJob __instance__ =
                    new ApplianceExportJob(
                            id,
                            compartmentId,
                            bucketName,
                            displayName,
                            creationTime,
                            lifecycleState,
                            lifecycleStateDetails,
                            applianceSerialNumber,
                            applianceDecryptionPassphrase,
                            applianceDeliveryVendor,
                            applianceDeliveryTrackingNumber,
                            applianceReturnDeliveryTrackingNumber,
                            sendingSecurityTie,
                            receivingSecurityTie,
                            prefix,
                            rangeStart,
                            rangeEnd,
                            numberOfObjects,
                            totalSizeInBytes,
                            firstObject,
                            lastObject,
                            nextObject,
                            manifestFile,
                            manifestMd5,
                            bucketAccessPolicies,
                            customerShippingAddress,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplianceExportJob o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .bucketName(o.getBucketName())
                            .displayName(o.getDisplayName())
                            .creationTime(o.getCreationTime())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleStateDetails(o.getLifecycleStateDetails())
                            .applianceSerialNumber(o.getApplianceSerialNumber())
                            .applianceDecryptionPassphrase(o.getApplianceDecryptionPassphrase())
                            .applianceDeliveryVendor(o.getApplianceDeliveryVendor())
                            .applianceDeliveryTrackingNumber(o.getApplianceDeliveryTrackingNumber())
                            .applianceReturnDeliveryTrackingNumber(
                                    o.getApplianceReturnDeliveryTrackingNumber())
                            .sendingSecurityTie(o.getSendingSecurityTie())
                            .receivingSecurityTie(o.getReceivingSecurityTie())
                            .prefix(o.getPrefix())
                            .rangeStart(o.getRangeStart())
                            .rangeEnd(o.getRangeEnd())
                            .numberOfObjects(o.getNumberOfObjects())
                            .totalSizeInBytes(o.getTotalSizeInBytes())
                            .firstObject(o.getFirstObject())
                            .lastObject(o.getLastObject())
                            .nextObject(o.getNextObject())
                            .manifestFile(o.getManifestFile())
                            .manifestMd5(o.getManifestMd5())
                            .bucketAccessPolicies(o.getBucketAccessPolicies())
                            .customerShippingAddress(o.getCustomerShippingAddress())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    private final java.util.Date creationTime;

    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inprogress("INPROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Cancelled("CANCELLED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A property that can contain details on the lifecycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /**
     * Serial Number of the Appliance associated with this Export Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceSerialNumber")
    private final String applianceSerialNumber;

    public String getApplianceSerialNumber() {
        return applianceSerialNumber;
    }

    /**
     * Passphrase associated with the Appliance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceDecryptionPassphrase")
    private final String applianceDecryptionPassphrase;

    public String getApplianceDecryptionPassphrase() {
        return applianceDecryptionPassphrase;
    }

    /**
     * Shipping Vendor selected to ship the Appliance associated with this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryVendor")
    private final String applianceDeliveryVendor;

    public String getApplianceDeliveryVendor() {
        return applianceDeliveryVendor;
    }

    /**
     * Tracking number associated with the shipment while shipping the Appliance to Customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryTrackingNumber")
    private final String applianceDeliveryTrackingNumber;

    public String getApplianceDeliveryTrackingNumber() {
        return applianceDeliveryTrackingNumber;
    }

    /**
     * Tracking number associated with the shipment while shipping the Appliance back to Oracle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceReturnDeliveryTrackingNumber")
    private final String applianceReturnDeliveryTrackingNumber;

    public String getApplianceReturnDeliveryTrackingNumber() {
        return applianceReturnDeliveryTrackingNumber;
    }

    /**
     * Unique number associated with the security tie used to seal the Appliance case.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sendingSecurityTie")
    private final String sendingSecurityTie;

    public String getSendingSecurityTie() {
        return sendingSecurityTie;
    }

    /**
     * Unique number associated with the return security tie used to seal the Appliance case.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("receivingSecurityTie")
    private final String receivingSecurityTie;

    public String getReceivingSecurityTie() {
        return receivingSecurityTie;
    }

    /**
     * List of objects with names matching this prefix would be part of this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    public String getPrefix() {
        return prefix;
    }

    /**
     * The name of the first object in the range of objects that are expected to be part of this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
    private final String rangeStart;

    public String getRangeStart() {
        return rangeStart;
    }

    /**
     * The name of the last object in the range of objects that are expected to be part of this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
    private final String rangeEnd;

    public String getRangeEnd() {
        return rangeEnd;
    }

    /**
     * Total number of objects that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfObjects")
    private final String numberOfObjects;

    public String getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Total size of objects in Bytes that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInBytes")
    private final String totalSizeInBytes;

    public String getTotalSizeInBytes() {
        return totalSizeInBytes;
    }

    /**
     * First object in the list of objects that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstObject")
    private final String firstObject;

    public String getFirstObject() {
        return firstObject;
    }

    /**
     * Last object in the list of objects that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastObject")
    private final String lastObject;

    public String getLastObject() {
        return lastObject;
    }

    /**
     * First object from which the next potential export job could start.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextObject")
    private final String nextObject;

    public String getNextObject() {
        return nextObject;
    }

    /**
     * Url of the Manifest File associated with this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manifestFile")
    private final String manifestFile;

    public String getManifestFile() {
        return manifestFile;
    }

    /**
     * md5 digest of the manifest file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manifestMd5")
    private final String manifestMd5;

    public String getManifestMd5() {
        return manifestMd5;
    }

    /**
     * Polices to grant Data Transfer Service to access objects in the Bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketAccessPolicies")
    private final java.util.List<String> bucketAccessPolicies;

    public java.util.List<String> getBucketAccessPolicies() {
        return bucketAccessPolicies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApplianceExportJob(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", applianceSerialNumber=").append(String.valueOf(this.applianceSerialNumber));
        sb.append(", applianceDecryptionPassphrase=")
                .append(String.valueOf(this.applianceDecryptionPassphrase));
        sb.append(", applianceDeliveryVendor=")
                .append(String.valueOf(this.applianceDeliveryVendor));
        sb.append(", applianceDeliveryTrackingNumber=")
                .append(String.valueOf(this.applianceDeliveryTrackingNumber));
        sb.append(", applianceReturnDeliveryTrackingNumber=")
                .append(String.valueOf(this.applianceReturnDeliveryTrackingNumber));
        sb.append(", sendingSecurityTie=").append(String.valueOf(this.sendingSecurityTie));
        sb.append(", receivingSecurityTie=").append(String.valueOf(this.receivingSecurityTie));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", rangeStart=").append(String.valueOf(this.rangeStart));
        sb.append(", rangeEnd=").append(String.valueOf(this.rangeEnd));
        sb.append(", numberOfObjects=").append(String.valueOf(this.numberOfObjects));
        sb.append(", totalSizeInBytes=").append(String.valueOf(this.totalSizeInBytes));
        sb.append(", firstObject=").append(String.valueOf(this.firstObject));
        sb.append(", lastObject=").append(String.valueOf(this.lastObject));
        sb.append(", nextObject=").append(String.valueOf(this.nextObject));
        sb.append(", manifestFile=").append(String.valueOf(this.manifestFile));
        sb.append(", manifestMd5=").append(String.valueOf(this.manifestMd5));
        sb.append(", bucketAccessPolicies=").append(String.valueOf(this.bucketAccessPolicies));
        sb.append(", customerShippingAddress=")
                .append(String.valueOf(this.customerShippingAddress));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplianceExportJob)) {
            return false;
        }

        ApplianceExportJob other = (ApplianceExportJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.creationTime, other.creationTime)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.applianceSerialNumber, other.applianceSerialNumber)
                && java.util.Objects.equals(
                        this.applianceDecryptionPassphrase, other.applianceDecryptionPassphrase)
                && java.util.Objects.equals(
                        this.applianceDeliveryVendor, other.applianceDeliveryVendor)
                && java.util.Objects.equals(
                        this.applianceDeliveryTrackingNumber, other.applianceDeliveryTrackingNumber)
                && java.util.Objects.equals(
                        this.applianceReturnDeliveryTrackingNumber,
                        other.applianceReturnDeliveryTrackingNumber)
                && java.util.Objects.equals(this.sendingSecurityTie, other.sendingSecurityTie)
                && java.util.Objects.equals(this.receivingSecurityTie, other.receivingSecurityTie)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.rangeStart, other.rangeStart)
                && java.util.Objects.equals(this.rangeEnd, other.rangeEnd)
                && java.util.Objects.equals(this.numberOfObjects, other.numberOfObjects)
                && java.util.Objects.equals(this.totalSizeInBytes, other.totalSizeInBytes)
                && java.util.Objects.equals(this.firstObject, other.firstObject)
                && java.util.Objects.equals(this.lastObject, other.lastObject)
                && java.util.Objects.equals(this.nextObject, other.nextObject)
                && java.util.Objects.equals(this.manifestFile, other.manifestFile)
                && java.util.Objects.equals(this.manifestMd5, other.manifestMd5)
                && java.util.Objects.equals(this.bucketAccessPolicies, other.bucketAccessPolicies)
                && java.util.Objects.equals(
                        this.customerShippingAddress, other.customerShippingAddress)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceSerialNumber == null
                                ? 43
                                : this.applianceSerialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceDecryptionPassphrase == null
                                ? 43
                                : this.applianceDecryptionPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceDeliveryVendor == null
                                ? 43
                                : this.applianceDeliveryVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceDeliveryTrackingNumber == null
                                ? 43
                                : this.applianceDeliveryTrackingNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceReturnDeliveryTrackingNumber == null
                                ? 43
                                : this.applianceReturnDeliveryTrackingNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.sendingSecurityTie == null
                                ? 43
                                : this.sendingSecurityTie.hashCode());
        result =
                (result * PRIME)
                        + (this.receivingSecurityTie == null
                                ? 43
                                : this.receivingSecurityTie.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.rangeStart == null ? 43 : this.rangeStart.hashCode());
        result = (result * PRIME) + (this.rangeEnd == null ? 43 : this.rangeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfObjects == null ? 43 : this.numberOfObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSizeInBytes == null ? 43 : this.totalSizeInBytes.hashCode());
        result = (result * PRIME) + (this.firstObject == null ? 43 : this.firstObject.hashCode());
        result = (result * PRIME) + (this.lastObject == null ? 43 : this.lastObject.hashCode());
        result = (result * PRIME) + (this.nextObject == null ? 43 : this.nextObject.hashCode());
        result = (result * PRIME) + (this.manifestFile == null ? 43 : this.manifestFile.hashCode());
        result = (result * PRIME) + (this.manifestMd5 == null ? 43 : this.manifestMd5.hashCode());
        result =
                (result * PRIME)
                        + (this.bucketAccessPolicies == null
                                ? 43
                                : this.bucketAccessPolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
