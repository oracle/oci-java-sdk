/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A compliance document that exists in the tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComplianceDocument.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComplianceDocument
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "timeCreated",
        "lifecycleState",
        "documentFileName",
        "version",
        "type",
        "platform",
        "timeUpdated",
        "saasServiceName"
    })
    public ComplianceDocument(
            String id,
            String name,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            String documentFileName,
            Integer version,
            String type,
            String platform,
            java.util.Date timeUpdated,
            String saasServiceName) {
        super();
        this.id = id;
        this.name = name;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.documentFileName = documentFileName;
        this.version = version;
        this.type = type;
        this.platform = platform;
        this.timeUpdated = timeUpdated;
        this.saasServiceName = saasServiceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compliance document, which is assigned when you create the document as an Oracle Cloud
         * Infrastructure resource and is immutable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compliance document, which is assigned when you create the document as an Oracle Cloud
         * Infrastructure resource and is immutable.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A friendly name or title for the compliance document. You cannot update this value later.
         * Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A friendly name or title for the compliance document. You cannot update this value later.
         * Avoid entering confidential information.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The date and time the compliance document was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the compliance document was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current lifecycle state of the compliance document. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the compliance document.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The file name of the compliance document. */
        @com.fasterxml.jackson.annotation.JsonProperty("documentFileName")
        private String documentFileName;

        /**
         * The file name of the compliance document.
         *
         * @param documentFileName the value to set
         * @return this builder
         */
        public Builder documentFileName(String documentFileName) {
            this.documentFileName = documentFileName;
            this.__explicitlySet__.add("documentFileName");
            return this;
        }
        /** The version number of the compliance document. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * The version number of the compliance document.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The type of compliance document. For definitions of supported types of compliance
         * documents, see [Types of Compliance
         * Documents](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#DocTypes).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of compliance document. For definitions of supported types of compliance
         * documents, see [Types of Compliance
         * Documents](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#DocTypes).
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The information technology infrastructure platform, or set of services, to which the
         * compliance document belongs. A platform can also be described as an environment or a
         * business pillar. For definitions of supported environments, see [Types of
         * Environments](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#EnvironmentTypes).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * The information technology infrastructure platform, or set of services, to which the
         * compliance document belongs. A platform can also be described as an environment or a
         * business pillar. For definitions of supported environments, see [Types of
         * Environments](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#EnvironmentTypes).
         *
         * @param platform the value to set
         * @return this builder
         */
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /**
         * The date and time the compliance document was last updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the compliance document was last updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The saas service name to which compliance document belongs. For other types such as 'OCI'
         * / 'PaaS' this value will be null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("saasServiceName")
        private String saasServiceName;

        /**
         * The saas service name to which compliance document belongs. For other types such as 'OCI'
         * / 'PaaS' this value will be null.
         *
         * @param saasServiceName the value to set
         * @return this builder
         */
        public Builder saasServiceName(String saasServiceName) {
            this.saasServiceName = saasServiceName;
            this.__explicitlySet__.add("saasServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceDocument build() {
            ComplianceDocument model =
                    new ComplianceDocument(
                            this.id,
                            this.name,
                            this.timeCreated,
                            this.lifecycleState,
                            this.documentFileName,
                            this.version,
                            this.type,
                            this.platform,
                            this.timeUpdated,
                            this.saasServiceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceDocument model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("documentFileName")) {
                this.documentFileName(model.getDocumentFileName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("saasServiceName")) {
                this.saasServiceName(model.getSaasServiceName());
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
     * compliance document, which is assigned when you create the document as an Oracle Cloud
     * Infrastructure resource and is immutable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compliance document, which is assigned when you create the document as an Oracle Cloud
     * Infrastructure resource and is immutable.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A friendly name or title for the compliance document. You cannot update this value later.
     * Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A friendly name or title for the compliance document. You cannot update this value later.
     * Avoid entering confidential information.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The date and time the compliance document was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the compliance document was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current lifecycle state of the compliance document. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
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
    /** The current lifecycle state of the compliance document. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the compliance document.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The file name of the compliance document. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentFileName")
    private final String documentFileName;

    /**
     * The file name of the compliance document.
     *
     * @return the value
     */
    public String getDocumentFileName() {
        return documentFileName;
    }

    /** The version number of the compliance document. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * The version number of the compliance document.
     *
     * @return the value
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * The type of compliance document. For definitions of supported types of compliance documents,
     * see [Types of Compliance
     * Documents](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#DocTypes).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of compliance document. For definitions of supported types of compliance documents,
     * see [Types of Compliance
     * Documents](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#DocTypes).
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * The information technology infrastructure platform, or set of services, to which the
     * compliance document belongs. A platform can also be described as an environment or a business
     * pillar. For definitions of supported environments, see [Types of
     * Environments](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#EnvironmentTypes).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * The information technology infrastructure platform, or set of services, to which the
     * compliance document belongs. A platform can also be described as an environment or a business
     * pillar. For definitions of supported environments, see [Types of
     * Environments](https://docs.oracle.com/iaas/en-us/iaas/Content/ComplianceDocuments/Concepts/compliancedocsoverview.htm#EnvironmentTypes).
     *
     * @return the value
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * The date and time the compliance document was last updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the compliance document was last updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The saas service name to which compliance document belongs. For other types such as 'OCI' /
     * 'PaaS' this value will be null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("saasServiceName")
    private final String saasServiceName;

    /**
     * The saas service name to which compliance document belongs. For other types such as 'OCI' /
     * 'PaaS' this value will be null.
     *
     * @return the value
     */
    public String getSaasServiceName() {
        return saasServiceName;
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
        sb.append("ComplianceDocument(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", documentFileName=").append(String.valueOf(this.documentFileName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", platform=").append(String.valueOf(this.platform));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", saasServiceName=").append(String.valueOf(this.saasServiceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceDocument)) {
            return false;
        }

        ComplianceDocument other = (ComplianceDocument) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.documentFileName, other.documentFileName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.saasServiceName, other.saasServiceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.documentFileName == null ? 43 : this.documentFileName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.saasServiceName == null ? 43 : this.saasServiceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
