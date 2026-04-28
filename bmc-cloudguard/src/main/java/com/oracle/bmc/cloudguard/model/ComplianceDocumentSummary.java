/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A summary representation of the compliance document. <br>
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
        builder = ComplianceDocumentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComplianceDocumentSummary
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
        "saasServiceName",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ComplianceDocumentSummary(
            String id,
            String name,
            java.util.Date timeCreated,
            ComplianceDocument.LifecycleState lifecycleState,
            String documentFileName,
            Integer version,
            String type,
            String platform,
            java.util.Date timeUpdated,
            String saasServiceName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
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
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier for the document that is assigned when you create the document as an
         * Oracle Cloud Infrastructure resource and is immutable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for the document that is assigned when you create the document as an
         * Oracle Cloud Infrastructure resource and is immutable.
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
        private ComplianceDocument.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the compliance document.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ComplianceDocument.LifecycleState lifecycleState) {
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
        /** The type of compliance document. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of compliance document.
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
         * The environment, also known as platform or business pillar, to which the compliance
         * document belongs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * The environment, also known as platform or business pillar, to which the compliance
         * document belongs.
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
        /** The saas service name to which compliance document belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("saasServiceName")
        private String saasServiceName;

        /**
         * The saas service name to which compliance document belongs.
         *
         * @param saasServiceName the value to set
         * @return this builder
         */
        public Builder saasServiceName(String saasServiceName) {
            this.saasServiceName = saasServiceName;
            this.__explicitlySet__.add("saasServiceName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceDocumentSummary build() {
            ComplianceDocumentSummary model =
                    new ComplianceDocumentSummary(
                            this.id,
                            this.name,
                            this.timeCreated,
                            this.lifecycleState,
                            this.documentFileName,
                            this.version,
                            this.type,
                            this.platform,
                            this.timeUpdated,
                            this.saasServiceName,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceDocumentSummary model) {
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * A unique identifier for the document that is assigned when you create the document as an
     * Oracle Cloud Infrastructure resource and is immutable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for the document that is assigned when you create the document as an
     * Oracle Cloud Infrastructure resource and is immutable.
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
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ComplianceDocument.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the compliance document.
     *
     * @return the value
     */
    public ComplianceDocument.LifecycleState getLifecycleState() {
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

    /** The type of compliance document. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of compliance document.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * The environment, also known as platform or business pillar, to which the compliance document
     * belongs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * The environment, also known as platform or business pillar, to which the compliance document
     * belongs.
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

    /** The saas service name to which compliance document belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("saasServiceName")
    private final String saasServiceName;

    /**
     * The saas service name to which compliance document belongs.
     *
     * @return the value
     */
    public String getSaasServiceName() {
        return saasServiceName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ComplianceDocumentSummary(");
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
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceDocumentSummary)) {
            return false;
        }

        ComplianceDocumentSummary other = (ComplianceDocumentSummary) o;
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
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
