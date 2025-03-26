/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * An imported/instantiated package within an instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImportedPackage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportedPackage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "odaInstanceId",
        "currentPackageId",
        "name",
        "displayName",
        "version",
        "status",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "statusMessage",
        "parameterValues"
    })
    public ImportedPackage(
            String odaInstanceId,
            String currentPackageId,
            String name,
            String displayName,
            String version,
            Status status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String statusMessage,
            java.util.Map<String, String> parameterValues) {
        super();
        this.odaInstanceId = odaInstanceId;
        this.currentPackageId = currentPackageId;
        this.name = name;
        this.displayName = displayName;
        this.version = version;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.statusMessage = statusMessage;
        this.parameterValues = parameterValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ID of the host instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
        private String odaInstanceId;

        /**
         * ID of the host instance.
         * @param odaInstanceId the value to set
         * @return this builder
         **/
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            this.__explicitlySet__.add("odaInstanceId");
            return this;
        }
        /**
         * ID of the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentPackageId")
        private String currentPackageId;

        /**
         * ID of the package.
         * @param currentPackageId the value to set
         * @return this builder
         **/
        public Builder currentPackageId(String currentPackageId) {
            this.currentPackageId = currentPackageId;
            this.__explicitlySet__.add("currentPackageId");
            return this;
        }
        /**
         * Stable name of the package (the same across versions).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Stable name of the package (the same across versions).
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display name of the package (can change across versions).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the package (can change across versions).
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * version of the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * version of the package.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Status of the imported package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of the imported package.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * When the imported package was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * When the imported package was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * When the imported package was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * When the imported package was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Short message explaining the status of this imported package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
        private String statusMessage;

        /**
         * Short message explaining the status of this imported package.
         * @param statusMessage the value to set
         * @return this builder
         **/
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            this.__explicitlySet__.add("statusMessage");
            return this;
        }
        /**
         * A list of parameter values used to import the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
        private java.util.Map<String, String> parameterValues;

        /**
         * A list of parameter values used to import the package.
         * @param parameterValues the value to set
         * @return this builder
         **/
        public Builder parameterValues(java.util.Map<String, String> parameterValues) {
            this.parameterValues = parameterValues;
            this.__explicitlySet__.add("parameterValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportedPackage build() {
            ImportedPackage model =
                    new ImportedPackage(
                            this.odaInstanceId,
                            this.currentPackageId,
                            this.name,
                            this.displayName,
                            this.version,
                            this.status,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.statusMessage,
                            this.parameterValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportedPackage model) {
            if (model.wasPropertyExplicitlySet("odaInstanceId")) {
                this.odaInstanceId(model.getOdaInstanceId());
            }
            if (model.wasPropertyExplicitlySet("currentPackageId")) {
                this.currentPackageId(model.getCurrentPackageId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("statusMessage")) {
                this.statusMessage(model.getStatusMessage());
            }
            if (model.wasPropertyExplicitlySet("parameterValues")) {
                this.parameterValues(model.getParameterValues());
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
     * ID of the host instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
    private final String odaInstanceId;

    /**
     * ID of the host instance.
     * @return the value
     **/
    public String getOdaInstanceId() {
        return odaInstanceId;
    }

    /**
     * ID of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentPackageId")
    private final String currentPackageId;

    /**
     * ID of the package.
     * @return the value
     **/
    public String getCurrentPackageId() {
        return currentPackageId;
    }

    /**
     * Stable name of the package (the same across versions).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Stable name of the package (the same across versions).
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display name of the package (can change across versions).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the package (can change across versions).
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * version of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * version of the package.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Status of the imported package.
     **/
    public enum Status {
        Ready("READY"),
        OperationPending("OPERATION_PENDING"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the imported package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of the imported package.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * When the imported package was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the imported package was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the imported package was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * When the imported package was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Short message explaining the status of this imported package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
    private final String statusMessage;

    /**
     * Short message explaining the status of this imported package.
     * @return the value
     **/
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * A list of parameter values used to import the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
    private final java.util.Map<String, String> parameterValues;

    /**
     * A list of parameter values used to import the package.
     * @return the value
     **/
    public java.util.Map<String, String> getParameterValues() {
        return parameterValues;
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
        sb.append("ImportedPackage(");
        sb.append("super=").append(super.toString());
        sb.append("odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(", currentPackageId=").append(String.valueOf(this.currentPackageId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", statusMessage=").append(String.valueOf(this.statusMessage));
        sb.append(", parameterValues=").append(String.valueOf(this.parameterValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportedPackage)) {
            return false;
        }

        ImportedPackage other = (ImportedPackage) o;
        return java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.currentPackageId, other.currentPackageId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.statusMessage, other.statusMessage)
                && java.util.Objects.equals(this.parameterValues, other.parameterValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.currentPackageId == null ? 43 : this.currentPackageId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.statusMessage == null ? 43 : this.statusMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValues == null ? 43 : this.parameterValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
