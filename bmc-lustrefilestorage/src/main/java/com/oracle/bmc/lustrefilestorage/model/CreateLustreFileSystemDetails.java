/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * The details to create a Lustre file system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateLustreFileSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLustreFileSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "availabilityDomain",
        "displayName",
        "fileSystemDescription",
        "freeformTags",
        "definedTags",
        "nsgIds",
        "fileSystemName",
        "kmsKeyId",
        "capacityInGBs",
        "subnetId",
        "performanceTier",
        "clusterPlacementGroupId",
        "rootSquashConfiguration"
    })
    public CreateLustreFileSystemDetails(
            String compartmentId,
            String availabilityDomain,
            String displayName,
            String fileSystemDescription,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> nsgIds,
            String fileSystemName,
            String kmsKeyId,
            Integer capacityInGBs,
            String subnetId,
            PerformanceTier performanceTier,
            String clusterPlacementGroupId,
            RootSquashConfiguration rootSquashConfiguration) {
        super();
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.displayName = displayName;
        this.fileSystemDescription = fileSystemDescription;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.nsgIds = nsgIds;
        this.fileSystemName = fileSystemName;
        this.kmsKeyId = kmsKeyId;
        this.capacityInGBs = capacityInGBs;
        this.subnetId = subnetId;
        this.performanceTier = performanceTier;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.rootSquashConfiguration = rootSquashConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Lustre file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Lustre file system.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My Lustre file system}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My Lustre file system}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Short description of the Lustre file system. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemDescription")
        private String fileSystemDescription;

        /**
         * Short description of the Lustre file system. Avoid entering confidential information.
         *
         * @param fileSystemDescription the value to set
         * @return this builder
         */
        public Builder fileSystemDescription(String fileSystemDescription) {
            this.fileSystemDescription = fileSystemDescription;
            this.__explicitlySet__.add("fileSystemDescription");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array
         * after the list is created removes the lustre file system from all NSGs. For more
         * information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array
         * after the list is created removes the lustre file system from all NSGs. For more
         * information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * The Lustre file system name. This is used in mount commands and other aspects of the
         * client command line interface. The file system name is limited to 8 characters. Allowed
         * characters are lower and upper case English letters, numbers, and '_'. If you have
         * multiple Lustre file systems mounted on the same clients, this name can help distinguish
         * them.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
        private String fileSystemName;

        /**
         * The Lustre file system name. This is used in mount commands and other aspects of the
         * client command line interface. The file system name is limited to 8 characters. Allowed
         * characters are lower and upper case English letters, numbers, and '_'. If you have
         * multiple Lustre file systems mounted on the same clients, this name can help distinguish
         * them.
         *
         * @param fileSystemName the value to set
         * @return this builder
         */
        public Builder fileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            this.__explicitlySet__.add("fileSystemName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KMS key used to encrypt the encryption keys associated with this file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KMS key used to encrypt the encryption keys associated with this file system.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * Capacity of the Lustre file system in GB. You can increase capacity only in multiples of
         * 5 TB.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityInGBs")
        private Integer capacityInGBs;

        /**
         * Capacity of the Lustre file system in GB. You can increase capacity only in multiples of
         * 5 TB.
         *
         * @param capacityInGBs the value to set
         * @return this builder
         */
        public Builder capacityInGBs(Integer capacityInGBs) {
            this.capacityInGBs = capacityInGBs;
            this.__explicitlySet__.add("capacityInGBs");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the Lustre file system is in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the Lustre file system is in.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents
         * 125 megabytes per second per terabyte.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("performanceTier")
        private PerformanceTier performanceTier;

        /**
         * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents
         * 125 megabytes per second per terabyte.
         *
         * @param performanceTier the value to set
         * @return this builder
         */
        public Builder performanceTier(PerformanceTier performanceTier) {
            this.performanceTier = performanceTier;
            this.__explicitlySet__.add("performanceTier");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group in which the Lustre file system exists.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group in which the Lustre file system exists.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootSquashConfiguration")
        private RootSquashConfiguration rootSquashConfiguration;

        public Builder rootSquashConfiguration(RootSquashConfiguration rootSquashConfiguration) {
            this.rootSquashConfiguration = rootSquashConfiguration;
            this.__explicitlySet__.add("rootSquashConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLustreFileSystemDetails build() {
            CreateLustreFileSystemDetails model =
                    new CreateLustreFileSystemDetails(
                            this.compartmentId,
                            this.availabilityDomain,
                            this.displayName,
                            this.fileSystemDescription,
                            this.freeformTags,
                            this.definedTags,
                            this.nsgIds,
                            this.fileSystemName,
                            this.kmsKeyId,
                            this.capacityInGBs,
                            this.subnetId,
                            this.performanceTier,
                            this.clusterPlacementGroupId,
                            this.rootSquashConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLustreFileSystemDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("fileSystemDescription")) {
                this.fileSystemDescription(model.getFileSystemDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("fileSystemName")) {
                this.fileSystemName(model.getFileSystemName());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("capacityInGBs")) {
                this.capacityInGBs(model.getCapacityInGBs());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("performanceTier")) {
                this.performanceTier(model.getPerformanceTier());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("rootSquashConfiguration")) {
                this.rootSquashConfiguration(model.getRootSquashConfiguration());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Lustre file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Lustre file system.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My Lustre file system}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My Lustre file system}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Short description of the Lustre file system. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemDescription")
    private final String fileSystemDescription;

    /**
     * Short description of the Lustre file system. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getFileSystemDescription() {
        return fileSystemDescription;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array after
     * the list is created removes the lustre file system from all NSGs. For more information about
     * NSGs, see [Security
     * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this lustre file system. A maximum of 5 is allowed. Setting this to an empty array after
     * the list is created removes the lustre file system from all NSGs. For more information about
     * NSGs, see [Security
     * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The Lustre file system name. This is used in mount commands and other aspects of the client
     * command line interface. The file system name is limited to 8 characters. Allowed characters
     * are lower and upper case English letters, numbers, and '_'. If you have multiple Lustre file
     * systems mounted on the same clients, this name can help distinguish them.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
    private final String fileSystemName;

    /**
     * The Lustre file system name. This is used in mount commands and other aspects of the client
     * command line interface. The file system name is limited to 8 characters. Allowed characters
     * are lower and upper case English letters, numbers, and '_'. If you have multiple Lustre file
     * systems mounted on the same clients, this name can help distinguish them.
     *
     * @return the value
     */
    public String getFileSystemName() {
        return fileSystemName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the KMS
     * key used to encrypt the encryption keys associated with this file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the KMS
     * key used to encrypt the encryption keys associated with this file system.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Capacity of the Lustre file system in GB. You can increase capacity only in multiples of 5
     * TB.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityInGBs")
    private final Integer capacityInGBs;

    /**
     * Capacity of the Lustre file system in GB. You can increase capacity only in multiples of 5
     * TB.
     *
     * @return the value
     */
    public Integer getCapacityInGBs() {
        return capacityInGBs;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the Lustre file system is in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the Lustre file system is in.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents 125
     * megabytes per second per terabyte.
     */
    public enum PerformanceTier implements com.oracle.bmc.http.internal.BmcEnum {
        MbpsPerTb125("MBPS_PER_TB_125"),
        MbpsPerTb250("MBPS_PER_TB_250"),
        MbpsPerTb500("MBPS_PER_TB_500"),
        MbpsPerTb1000("MBPS_PER_TB_1000"),
        ;

        private final String value;
        private static java.util.Map<String, PerformanceTier> map;

        static {
            map = new java.util.HashMap<>();
            for (PerformanceTier v : PerformanceTier.values()) {
                map.put(v.getValue(), v);
            }
        }

        PerformanceTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PerformanceTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PerformanceTier: " + key);
        }
    };
    /**
     * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents 125
     * megabytes per second per terabyte.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performanceTier")
    private final PerformanceTier performanceTier;

    /**
     * The Lustre file system performance tier. A value of {@code MBPS_PER_TB_125} represents 125
     * megabytes per second per terabyte.
     *
     * @return the value
     */
    public PerformanceTier getPerformanceTier() {
        return performanceTier;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group in which the Lustre file system exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group in which the Lustre file system exists.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rootSquashConfiguration")
    private final RootSquashConfiguration rootSquashConfiguration;

    public RootSquashConfiguration getRootSquashConfiguration() {
        return rootSquashConfiguration;
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
        sb.append("CreateLustreFileSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", fileSystemDescription=").append(String.valueOf(this.fileSystemDescription));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", fileSystemName=").append(String.valueOf(this.fileSystemName));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", capacityInGBs=").append(String.valueOf(this.capacityInGBs));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", performanceTier=").append(String.valueOf(this.performanceTier));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", rootSquashConfiguration=")
                .append(String.valueOf(this.rootSquashConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLustreFileSystemDetails)) {
            return false;
        }

        CreateLustreFileSystemDetails other = (CreateLustreFileSystemDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.fileSystemDescription, other.fileSystemDescription)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.fileSystemName, other.fileSystemName)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.capacityInGBs, other.capacityInGBs)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.performanceTier, other.performanceTier)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(
                        this.rootSquashConfiguration, other.rootSquashConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemDescription == null
                                ? 43
                                : this.fileSystemDescription.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemName == null ? 43 : this.fileSystemName.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityInGBs == null ? 43 : this.capacityInGBs.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.performanceTier == null ? 43 : this.performanceTier.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.rootSquashConfiguration == null
                                ? 43
                                : this.rootSquashConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
