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
    builder = UpdateApplianceExportJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateApplianceExportJobDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bucketName",
        "prefix",
        "rangeStart",
        "rangeEnd",
        "displayName",
        "lifecycleState",
        "lifecycleStateDetails",
        "manifestFile",
        "manifestMd5",
        "numberOfObjects",
        "totalSizeInBytes",
        "firstObject",
        "lastObject",
        "nextObject",
        "customerShippingAddress",
        "freeformTags",
        "definedTags"
    })
    public UpdateApplianceExportJobDetails(
            String bucketName,
            String prefix,
            String rangeStart,
            String rangeEnd,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            String manifestFile,
            String manifestMd5,
            String numberOfObjects,
            String totalSizeInBytes,
            String firstObject,
            String lastObject,
            String nextObject,
            ShippingAddress customerShippingAddress,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.bucketName = bucketName;
        this.prefix = prefix;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.manifestFile = manifestFile;
        this.manifestMd5 = manifestMd5;
        this.numberOfObjects = numberOfObjects;
        this.totalSizeInBytes = totalSizeInBytes;
        this.firstObject = firstObject;
        this.lastObject = lastObject;
        this.nextObject = nextObject;
        this.customerShippingAddress = customerShippingAddress;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        public UpdateApplianceExportJobDetails build() {
            UpdateApplianceExportJobDetails __instance__ =
                    new UpdateApplianceExportJobDetails(
                            bucketName,
                            prefix,
                            rangeStart,
                            rangeEnd,
                            displayName,
                            lifecycleState,
                            lifecycleStateDetails,
                            manifestFile,
                            manifestMd5,
                            numberOfObjects,
                            totalSizeInBytes,
                            firstObject,
                            lastObject,
                            nextObject,
                            customerShippingAddress,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateApplianceExportJobDetails o) {
            Builder copiedBuilder =
                    bucketName(o.getBucketName())
                            .prefix(o.getPrefix())
                            .rangeStart(o.getRangeStart())
                            .rangeEnd(o.getRangeEnd())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleStateDetails(o.getLifecycleStateDetails())
                            .manifestFile(o.getManifestFile())
                            .manifestMd5(o.getManifestMd5())
                            .numberOfObjects(o.getNumberOfObjects())
                            .totalSizeInBytes(o.getTotalSizeInBytes())
                            .firstObject(o.getFirstObject())
                            .lastObject(o.getLastObject())
                            .nextObject(o.getNextObject())
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

    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    public String getBucketName() {
        return bucketName;
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
     * Object names returned by a list query must be greater or equal to this parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
    private final String rangeStart;

    public String getRangeStart() {
        return rangeStart;
    }

    /**
     * Object names returned by a list query must be strictly less than this parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
    private final String rangeEnd;

    public String getRangeEnd() {
        return rangeEnd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
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
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
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
     * Manifest File associated with this export job.
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
        sb.append("UpdateApplianceExportJobDetails(");
        sb.append("bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", rangeStart=").append(String.valueOf(this.rangeStart));
        sb.append(", rangeEnd=").append(String.valueOf(this.rangeEnd));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", manifestFile=").append(String.valueOf(this.manifestFile));
        sb.append(", manifestMd5=").append(String.valueOf(this.manifestMd5));
        sb.append(", numberOfObjects=").append(String.valueOf(this.numberOfObjects));
        sb.append(", totalSizeInBytes=").append(String.valueOf(this.totalSizeInBytes));
        sb.append(", firstObject=").append(String.valueOf(this.firstObject));
        sb.append(", lastObject=").append(String.valueOf(this.lastObject));
        sb.append(", nextObject=").append(String.valueOf(this.nextObject));
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
        if (!(o instanceof UpdateApplianceExportJobDetails)) {
            return false;
        }

        UpdateApplianceExportJobDetails other = (UpdateApplianceExportJobDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.rangeStart, other.rangeStart)
                && java.util.Objects.equals(this.rangeEnd, other.rangeEnd)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.manifestFile, other.manifestFile)
                && java.util.Objects.equals(this.manifestMd5, other.manifestMd5)
                && java.util.Objects.equals(this.numberOfObjects, other.numberOfObjects)
                && java.util.Objects.equals(this.totalSizeInBytes, other.totalSizeInBytes)
                && java.util.Objects.equals(this.firstObject, other.firstObject)
                && java.util.Objects.equals(this.lastObject, other.lastObject)
                && java.util.Objects.equals(this.nextObject, other.nextObject)
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
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.rangeStart == null ? 43 : this.rangeStart.hashCode());
        result = (result * PRIME) + (this.rangeEnd == null ? 43 : this.rangeEnd.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.manifestFile == null ? 43 : this.manifestFile.hashCode());
        result = (result * PRIME) + (this.manifestMd5 == null ? 43 : this.manifestMd5.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfObjects == null ? 43 : this.numberOfObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSizeInBytes == null ? 43 : this.totalSizeInBytes.hashCode());
        result = (result * PRIME) + (this.firstObject == null ? 43 : this.firstObject.hashCode());
        result = (result * PRIME) + (this.lastObject == null ? 43 : this.lastObject.hashCode());
        result = (result * PRIME) + (this.nextObject == null ? 43 : this.nextObject.hashCode());
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
