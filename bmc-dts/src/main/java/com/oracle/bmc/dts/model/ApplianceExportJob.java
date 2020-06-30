/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplianceExportJob.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ApplianceExportJob {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    java.util.Date creationTime;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
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
    LifecycleState lifecycleState;

    /**
     * A property that can contain details on the lifecycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    String lifecycleStateDetails;

    /**
     * Serial Number of the Appliance associated with this Export Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceSerialNumber")
    String applianceSerialNumber;

    /**
     * Passphrase associated with the Appliance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceDecryptionPassphrase")
    String applianceDecryptionPassphrase;

    /**
     * Shipping Vendor selected to ship the Appliance associated with this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryVendor")
    String applianceDeliveryVendor;

    /**
     * Tracking number associated with the shipment while shipping the Appliance to Customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryTrackingNumber")
    String applianceDeliveryTrackingNumber;

    /**
     * Tracking number associated with the shipment while shipping the Appliance back to Oracle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applianceReturnDeliveryTrackingNumber")
    String applianceReturnDeliveryTrackingNumber;

    /**
     * Unique number associated with the security tie used to seal the Appliance case.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sendingSecurityTie")
    String sendingSecurityTie;

    /**
     * Unique number associated with the return security tie used to seal the Appliance case.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("receivingSecurityTie")
    String receivingSecurityTie;

    /**
     * List of objects with names matching this prefix would be part of this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    String prefix;

    /**
     * The name of the first object in the range of objects that are expected to be part of this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
    String rangeStart;

    /**
     * The name of the last object in the range of objects that are expected to be part of this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
    String rangeEnd;

    /**
     * Total number of objects that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfObjects")
    String numberOfObjects;

    /**
     * Total size of objects in Bytes that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInBytes")
    String totalSizeInBytes;

    /**
     * First object in the list of objects that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstObject")
    String firstObject;

    /**
     * Last object in the list of objects that are exported in this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastObject")
    String lastObject;

    /**
     * First object from which the next potential export job could start.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextObject")
    String nextObject;

    /**
     * Url of the Manifest File associated with this export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manifestFile")
    String manifestFile;

    /**
     * md5 digest of the manifest file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manifestMd5")
    String manifestMd5;

    /**
     * Polices to grant Data Transfer Service to access objects in the Bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketAccessPolicies")
    java.util.List<String> bucketAccessPolicies;

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    ShippingAddress customerShippingAddress;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
