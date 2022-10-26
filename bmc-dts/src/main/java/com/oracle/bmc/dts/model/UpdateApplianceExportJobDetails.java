/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateApplianceExportJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateApplianceExportJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "expectedReturnDate",
        "pickupWindowStartTime",
        "pickupWindowEndTime",
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
            java.util.Date expectedReturnDate,
            java.util.Date pickupWindowStartTime,
            java.util.Date pickupWindowEndTime,
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
        this.expectedReturnDate = expectedReturnDate;
        this.pickupWindowStartTime = pickupWindowStartTime;
        this.pickupWindowEndTime = pickupWindowEndTime;
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
        /** List of objects with names matching this prefix would be part of this export job. */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * List of objects with names matching this prefix would be part of this export job.
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /** Object names returned by a list query must be greater or equal to this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
        private String rangeStart;

        /**
         * Object names returned by a list query must be greater or equal to this parameter.
         *
         * @param rangeStart the value to set
         * @return this builder
         */
        public Builder rangeStart(String rangeStart) {
            this.rangeStart = rangeStart;
            this.__explicitlySet__.add("rangeStart");
            return this;
        }
        /** Object names returned by a list query must be strictly less than this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
        private String rangeEnd;

        /**
         * Object names returned by a list query must be strictly less than this parameter.
         *
         * @param rangeEnd the value to set
         * @return this builder
         */
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
        /** A property that can contain details on the lifecycle. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * A property that can contain details on the lifecycle.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /** Manifest File associated with this export job. */
        @com.fasterxml.jackson.annotation.JsonProperty("manifestFile")
        private String manifestFile;

        /**
         * Manifest File associated with this export job.
         *
         * @param manifestFile the value to set
         * @return this builder
         */
        public Builder manifestFile(String manifestFile) {
            this.manifestFile = manifestFile;
            this.__explicitlySet__.add("manifestFile");
            return this;
        }
        /** md5 digest of the manifest file. */
        @com.fasterxml.jackson.annotation.JsonProperty("manifestMd5")
        private String manifestMd5;

        /**
         * md5 digest of the manifest file.
         *
         * @param manifestMd5 the value to set
         * @return this builder
         */
        public Builder manifestMd5(String manifestMd5) {
            this.manifestMd5 = manifestMd5;
            this.__explicitlySet__.add("manifestMd5");
            return this;
        }
        /** Total number of objects that are exported in this job. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfObjects")
        private String numberOfObjects;

        /**
         * Total number of objects that are exported in this job.
         *
         * @param numberOfObjects the value to set
         * @return this builder
         */
        public Builder numberOfObjects(String numberOfObjects) {
            this.numberOfObjects = numberOfObjects;
            this.__explicitlySet__.add("numberOfObjects");
            return this;
        }
        /** Total size of objects in Bytes that are exported in this job. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInBytes")
        private String totalSizeInBytes;

        /**
         * Total size of objects in Bytes that are exported in this job.
         *
         * @param totalSizeInBytes the value to set
         * @return this builder
         */
        public Builder totalSizeInBytes(String totalSizeInBytes) {
            this.totalSizeInBytes = totalSizeInBytes;
            this.__explicitlySet__.add("totalSizeInBytes");
            return this;
        }
        /** First object in the list of objects that are exported in this job. */
        @com.fasterxml.jackson.annotation.JsonProperty("firstObject")
        private String firstObject;

        /**
         * First object in the list of objects that are exported in this job.
         *
         * @param firstObject the value to set
         * @return this builder
         */
        public Builder firstObject(String firstObject) {
            this.firstObject = firstObject;
            this.__explicitlySet__.add("firstObject");
            return this;
        }
        /** Last object in the list of objects that are exported in this job. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastObject")
        private String lastObject;

        /**
         * Last object in the list of objects that are exported in this job.
         *
         * @param lastObject the value to set
         * @return this builder
         */
        public Builder lastObject(String lastObject) {
            this.lastObject = lastObject;
            this.__explicitlySet__.add("lastObject");
            return this;
        }
        /** First object from which the next potential export job could start. */
        @com.fasterxml.jackson.annotation.JsonProperty("nextObject")
        private String nextObject;

        /**
         * First object from which the next potential export job could start.
         *
         * @param nextObject the value to set
         * @return this builder
         */
        public Builder nextObject(String nextObject) {
            this.nextObject = nextObject;
            this.__explicitlySet__.add("nextObject");
            return this;
        }
        /** Expected return date from customer for the device, time portion should be zero. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedReturnDate")
        private java.util.Date expectedReturnDate;

        /**
         * Expected return date from customer for the device, time portion should be zero.
         *
         * @param expectedReturnDate the value to set
         * @return this builder
         */
        public Builder expectedReturnDate(java.util.Date expectedReturnDate) {
            this.expectedReturnDate = expectedReturnDate;
            this.__explicitlySet__.add("expectedReturnDate");
            return this;
        }
        /** Start time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowStartTime")
        private java.util.Date pickupWindowStartTime;

        /**
         * Start time for the window to pickup the device from customer.
         *
         * @param pickupWindowStartTime the value to set
         * @return this builder
         */
        public Builder pickupWindowStartTime(java.util.Date pickupWindowStartTime) {
            this.pickupWindowStartTime = pickupWindowStartTime;
            this.__explicitlySet__.add("pickupWindowStartTime");
            return this;
        }
        /** End time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowEndTime")
        private java.util.Date pickupWindowEndTime;

        /**
         * End time for the window to pickup the device from customer.
         *
         * @param pickupWindowEndTime the value to set
         * @return this builder
         */
        public Builder pickupWindowEndTime(java.util.Date pickupWindowEndTime) {
            this.pickupWindowEndTime = pickupWindowEndTime;
            this.__explicitlySet__.add("pickupWindowEndTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateApplianceExportJobDetails build() {
            UpdateApplianceExportJobDetails model =
                    new UpdateApplianceExportJobDetails(
                            this.bucketName,
                            this.prefix,
                            this.rangeStart,
                            this.rangeEnd,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.manifestFile,
                            this.manifestMd5,
                            this.numberOfObjects,
                            this.totalSizeInBytes,
                            this.firstObject,
                            this.lastObject,
                            this.nextObject,
                            this.expectedReturnDate,
                            this.pickupWindowStartTime,
                            this.pickupWindowEndTime,
                            this.customerShippingAddress,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateApplianceExportJobDetails model) {
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("rangeStart")) {
                this.rangeStart(model.getRangeStart());
            }
            if (model.wasPropertyExplicitlySet("rangeEnd")) {
                this.rangeEnd(model.getRangeEnd());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("manifestFile")) {
                this.manifestFile(model.getManifestFile());
            }
            if (model.wasPropertyExplicitlySet("manifestMd5")) {
                this.manifestMd5(model.getManifestMd5());
            }
            if (model.wasPropertyExplicitlySet("numberOfObjects")) {
                this.numberOfObjects(model.getNumberOfObjects());
            }
            if (model.wasPropertyExplicitlySet("totalSizeInBytes")) {
                this.totalSizeInBytes(model.getTotalSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("firstObject")) {
                this.firstObject(model.getFirstObject());
            }
            if (model.wasPropertyExplicitlySet("lastObject")) {
                this.lastObject(model.getLastObject());
            }
            if (model.wasPropertyExplicitlySet("nextObject")) {
                this.nextObject(model.getNextObject());
            }
            if (model.wasPropertyExplicitlySet("expectedReturnDate")) {
                this.expectedReturnDate(model.getExpectedReturnDate());
            }
            if (model.wasPropertyExplicitlySet("pickupWindowStartTime")) {
                this.pickupWindowStartTime(model.getPickupWindowStartTime());
            }
            if (model.wasPropertyExplicitlySet("pickupWindowEndTime")) {
                this.pickupWindowEndTime(model.getPickupWindowEndTime());
            }
            if (model.wasPropertyExplicitlySet("customerShippingAddress")) {
                this.customerShippingAddress(model.getCustomerShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
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

    /** List of objects with names matching this prefix would be part of this export job. */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * List of objects with names matching this prefix would be part of this export job.
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /** Object names returned by a list query must be greater or equal to this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
    private final String rangeStart;

    /**
     * Object names returned by a list query must be greater or equal to this parameter.
     *
     * @return the value
     */
    public String getRangeStart() {
        return rangeStart;
    }

    /** Object names returned by a list query must be strictly less than this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
    private final String rangeEnd;

    /**
     * Object names returned by a list query must be strictly less than this parameter.
     *
     * @return the value
     */
    public String getRangeEnd() {
        return rangeEnd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /** */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** A property that can contain details on the lifecycle. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * A property that can contain details on the lifecycle.
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /** Manifest File associated with this export job. */
    @com.fasterxml.jackson.annotation.JsonProperty("manifestFile")
    private final String manifestFile;

    /**
     * Manifest File associated with this export job.
     *
     * @return the value
     */
    public String getManifestFile() {
        return manifestFile;
    }

    /** md5 digest of the manifest file. */
    @com.fasterxml.jackson.annotation.JsonProperty("manifestMd5")
    private final String manifestMd5;

    /**
     * md5 digest of the manifest file.
     *
     * @return the value
     */
    public String getManifestMd5() {
        return manifestMd5;
    }

    /** Total number of objects that are exported in this job. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfObjects")
    private final String numberOfObjects;

    /**
     * Total number of objects that are exported in this job.
     *
     * @return the value
     */
    public String getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Total size of objects in Bytes that are exported in this job. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInBytes")
    private final String totalSizeInBytes;

    /**
     * Total size of objects in Bytes that are exported in this job.
     *
     * @return the value
     */
    public String getTotalSizeInBytes() {
        return totalSizeInBytes;
    }

    /** First object in the list of objects that are exported in this job. */
    @com.fasterxml.jackson.annotation.JsonProperty("firstObject")
    private final String firstObject;

    /**
     * First object in the list of objects that are exported in this job.
     *
     * @return the value
     */
    public String getFirstObject() {
        return firstObject;
    }

    /** Last object in the list of objects that are exported in this job. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastObject")
    private final String lastObject;

    /**
     * Last object in the list of objects that are exported in this job.
     *
     * @return the value
     */
    public String getLastObject() {
        return lastObject;
    }

    /** First object from which the next potential export job could start. */
    @com.fasterxml.jackson.annotation.JsonProperty("nextObject")
    private final String nextObject;

    /**
     * First object from which the next potential export job could start.
     *
     * @return the value
     */
    public String getNextObject() {
        return nextObject;
    }

    /** Expected return date from customer for the device, time portion should be zero. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedReturnDate")
    private final java.util.Date expectedReturnDate;

    /**
     * Expected return date from customer for the device, time portion should be zero.
     *
     * @return the value
     */
    public java.util.Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    /** Start time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowStartTime")
    private final java.util.Date pickupWindowStartTime;

    /**
     * Start time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getPickupWindowStartTime() {
        return pickupWindowStartTime;
    }

    /** End time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowEndTime")
    private final java.util.Date pickupWindowEndTime;

    /**
     * End time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getPickupWindowEndTime() {
        return pickupWindowEndTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateApplianceExportJobDetails(");
        sb.append("super=").append(super.toString());
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
        sb.append(", expectedReturnDate=").append(String.valueOf(this.expectedReturnDate));
        sb.append(", pickupWindowStartTime=").append(String.valueOf(this.pickupWindowStartTime));
        sb.append(", pickupWindowEndTime=").append(String.valueOf(this.pickupWindowEndTime));
        sb.append(", customerShippingAddress=")
                .append(String.valueOf(this.customerShippingAddress));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
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
                && java.util.Objects.equals(this.expectedReturnDate, other.expectedReturnDate)
                && java.util.Objects.equals(this.pickupWindowStartTime, other.pickupWindowStartTime)
                && java.util.Objects.equals(this.pickupWindowEndTime, other.pickupWindowEndTime)
                && java.util.Objects.equals(
                        this.customerShippingAddress, other.customerShippingAddress)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
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
                        + (this.expectedReturnDate == null
                                ? 43
                                : this.expectedReturnDate.hashCode());
        result =
                (result * PRIME)
                        + (this.pickupWindowStartTime == null
                                ? 43
                                : this.pickupWindowStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.pickupWindowEndTime == null
                                ? 43
                                : this.pickupWindowEndTime.hashCode());
        result =
                (result * PRIME)
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
