/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * A set of file systems to export through one or more mount
 * targets. Composed of zero or more export resources.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExportSet extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "displayName",
        "id",
        "lifecycleState",
        "maxFsStatBytes",
        "maxFsStatFiles",
        "timeCreated",
        "vcnId"
    })
    public ExportSet(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String id,
            LifecycleState lifecycleState,
            Long maxFsStatBytes,
            Long maxFsStatFiles,
            java.util.Date timeCreated,
            String vcnId) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.maxFsStatBytes = maxFsStatBytes;
        this.maxFsStatFiles = maxFsStatFiles;
        this.timeCreated = timeCreated;
        this.vcnId = vcnId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain the export set is in. May be unset
         * as a blank or NULL value.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the export set is in. May be unset
         * as a blank or NULL value.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the export set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the export set.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My export set}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My export set}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export set.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current state of the export set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the export set.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes},
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tbytes} value reported by {@code FSSTAT} will be
         * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
         * {@code maxFsStatBytes} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatBytes},
         * then {@code fbytes} and {@code abytes} will both be '0'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
        private Long maxFsStatBytes;

        /**
         * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes},
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tbytes} value reported by {@code FSSTAT} will be
         * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
         * {@code maxFsStatBytes} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatBytes},
         * then {@code fbytes} and {@code abytes} will both be '0'.
         *
         * @param maxFsStatBytes the value to set
         * @return this builder
         **/
        public Builder maxFsStatBytes(Long maxFsStatBytes) {
            this.maxFsStatBytes = maxFsStatBytes;
            this.__explicitlySet__.add("maxFsStatBytes");
            return this;
        }
        /**
         * Controls the maximum {@code tfiles}, {@code ffiles}, and {@code afiles}
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tfiles} value reported by {@code FSSTAT} will be
         * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
         * {@code maxFsStatFiles} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatFiles},
         * then {@code ffiles} and {@code afiles} will both be '0'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
        private Long maxFsStatFiles;

        /**
         * Controls the maximum {@code tfiles}, {@code ffiles}, and {@code afiles}
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tfiles} value reported by {@code FSSTAT} will be
         * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
         * {@code maxFsStatFiles} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatFiles},
         * then {@code ffiles} and {@code afiles} will both be '0'.
         *
         * @param maxFsStatFiles the value to set
         * @return this builder
         **/
        public Builder maxFsStatFiles(Long maxFsStatFiles) {
            this.maxFsStatFiles = maxFsStatFiles;
            this.__explicitlySet__.add("maxFsStatFiles");
            return this;
        }
        /**
         * The date and time the export set was created, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the export set was created, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual cloud network (VCN) the export set is in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual cloud network (VCN) the export set is in.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportSet build() {
            ExportSet model =
                    new ExportSet(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.displayName,
                            this.id,
                            this.lifecycleState,
                            this.maxFsStatBytes,
                            this.maxFsStatFiles,
                            this.timeCreated,
                            this.vcnId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportSet model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("maxFsStatBytes")) {
                this.maxFsStatBytes(model.getMaxFsStatBytes());
            }
            if (model.wasPropertyExplicitlySet("maxFsStatFiles")) {
                this.maxFsStatFiles(model.getMaxFsStatFiles());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            return this;
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

    /**
     * The availability domain the export set is in. May be unset
     * as a blank or NULL value.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the export set is in. May be unset
     * as a blank or NULL value.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the export set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the export set.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My export set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My export set}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export set.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The current state of the export set.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
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
    /**
     * The current state of the export set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the export set.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes},
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tbytes} value reported by {@code FSSTAT} will be
     * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
     * {@code maxFsStatBytes} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatBytes},
     * then {@code fbytes} and {@code abytes} will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
    private final Long maxFsStatBytes;

    /**
     * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes},
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tbytes} value reported by {@code FSSTAT} will be
     * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
     * {@code maxFsStatBytes} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatBytes},
     * then {@code fbytes} and {@code abytes} will both be '0'.
     *
     * @return the value
     **/
    public Long getMaxFsStatBytes() {
        return maxFsStatBytes;
    }

    /**
     * Controls the maximum {@code tfiles}, {@code ffiles}, and {@code afiles}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tfiles} value reported by {@code FSSTAT} will be
     * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
     * {@code maxFsStatFiles} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatFiles},
     * then {@code ffiles} and {@code afiles} will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
    private final Long maxFsStatFiles;

    /**
     * Controls the maximum {@code tfiles}, {@code ffiles}, and {@code afiles}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tfiles} value reported by {@code FSSTAT} will be
     * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
     * {@code maxFsStatFiles} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatFiles},
     * then {@code ffiles} and {@code afiles} will both be '0'.
     *
     * @return the value
     **/
    public Long getMaxFsStatFiles() {
        return maxFsStatFiles;
    }

    /**
     * The date and time the export set was created, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the export set was created, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual cloud network (VCN) the export set is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual cloud network (VCN) the export set is in.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExportSet(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", maxFsStatBytes=").append(String.valueOf(this.maxFsStatBytes));
        sb.append(", maxFsStatFiles=").append(String.valueOf(this.maxFsStatFiles));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportSet)) {
            return false;
        }

        ExportSet other = (ExportSet) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.maxFsStatBytes, other.maxFsStatBytes)
                && java.util.Objects.equals(this.maxFsStatFiles, other.maxFsStatFiles)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFsStatBytes == null ? 43 : this.maxFsStatBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFsStatFiles == null ? 43 : this.maxFsStatFiles.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
