/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsLookup <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsLookup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsLookup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activeEditVersion",
        "canonicalLink",
        "description",
        "editVersion",
        "fields",
        "lookupReference",
        "lookupReferenceString",
        "type",
        "name",
        "isBuiltIn",
        "isHidden",
        "lookupDisplayName",
        "referringSources",
        "statusSummary",
        "timeUpdated",
        "categories",
        "id",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public LogAnalyticsLookup(
            Long activeEditVersion,
            String canonicalLink,
            String description,
            Long editVersion,
            java.util.List<LookupField> fields,
            Long lookupReference,
            String lookupReferenceString,
            Type type,
            String name,
            Long isBuiltIn,
            Boolean isHidden,
            String lookupDisplayName,
            AutoLookups referringSources,
            StatusSummary statusSummary,
            java.util.Date timeUpdated,
            java.util.List<LogAnalyticsCategory> categories,
            String id,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.activeEditVersion = activeEditVersion;
        this.canonicalLink = canonicalLink;
        this.description = description;
        this.editVersion = editVersion;
        this.fields = fields;
        this.lookupReference = lookupReference;
        this.lookupReferenceString = lookupReferenceString;
        this.type = type;
        this.name = name;
        this.isBuiltIn = isBuiltIn;
        this.isHidden = isHidden;
        this.lookupDisplayName = lookupDisplayName;
        this.referringSources = referringSources;
        this.statusSummary = statusSummary;
        this.timeUpdated = timeUpdated;
        this.categories = categories;
        this.id = id;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The active edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("activeEditVersion")
        private Long activeEditVersion;

        /**
         * The active edit version.
         *
         * @param activeEditVersion the value to set
         * @return this builder
         */
        public Builder activeEditVersion(Long activeEditVersion) {
            this.activeEditVersion = activeEditVersion;
            this.__explicitlySet__.add("activeEditVersion");
            return this;
        }
        /** The canonical link. */
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
        private String canonicalLink;

        /**
         * The canonical link.
         *
         * @param canonicalLink the value to set
         * @return this builder
         */
        public Builder canonicalLink(String canonicalLink) {
            this.canonicalLink = canonicalLink;
            this.__explicitlySet__.add("canonicalLink");
            return this;
        }
        /** The lookup description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The lookup description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /** The lookup fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<LookupField> fields;

        /**
         * The lookup fields.
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.List<LookupField> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /** The lookup reference as an integer. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
        private Long lookupReference;

        /**
         * The lookup reference as an integer.
         *
         * @param lookupReference the value to set
         * @return this builder
         */
        public Builder lookupReference(Long lookupReference) {
            this.lookupReference = lookupReference;
            this.__explicitlySet__.add("lookupReference");
            return this;
        }
        /** The lookup reference as a string. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupReferenceString")
        private String lookupReferenceString;

        /**
         * The lookup reference as a string.
         *
         * @param lookupReferenceString the value to set
         * @return this builder
         */
        public Builder lookupReferenceString(String lookupReferenceString) {
            this.lookupReferenceString = lookupReferenceString;
            this.__explicitlySet__.add("lookupReferenceString");
            return this;
        }
        /** The lookup type. Valid values are Lookup, Dictionary or Module. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The lookup type. Valid values are Lookup, Dictionary or Module.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The lookup name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The lookup name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A flag indicating if the lookup is custom (user-defined) or built in. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBuiltIn")
        private Long isBuiltIn;

        /**
         * A flag indicating if the lookup is custom (user-defined) or built in.
         *
         * @param isBuiltIn the value to set
         * @return this builder
         */
        public Builder isBuiltIn(Long isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            this.__explicitlySet__.add("isBuiltIn");
            return this;
        }
        /**
         * A flag indicating if the lookup is hidden or not. A hidden lookup will not be returned in
         * list operations by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        /**
         * A flag indicating if the lookup is hidden or not. A hidden lookup will not be returned in
         * list operations by default.
         *
         * @param isHidden the value to set
         * @return this builder
         */
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /** The lookup display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
        private String lookupDisplayName;

        /**
         * The lookup display name.
         *
         * @param lookupDisplayName the value to set
         * @return this builder
         */
        public Builder lookupDisplayName(String lookupDisplayName) {
            this.lookupDisplayName = lookupDisplayName;
            this.__explicitlySet__.add("lookupDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referringSources")
        private AutoLookups referringSources;

        public Builder referringSources(AutoLookups referringSources) {
            this.referringSources = referringSources;
            this.__explicitlySet__.add("referringSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusSummary")
        private StatusSummary statusSummary;

        public Builder statusSummary(StatusSummary statusSummary) {
            this.statusSummary = statusSummary;
            this.__explicitlySet__.add("statusSummary");
            return this;
        }
        /** The last updated date. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last updated date.
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
         * An array of categories assigned to this lookup. The isSystem flag denotes if each
         * category assignment is user-created or Oracle-defined.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<LogAnalyticsCategory> categories;

        /**
         * An array of categories assigned to this lookup. The isSystem flag denotes if each
         * category assignment is user-created or Oracle-defined.
         *
         * @param categories the value to set
         * @return this builder
         */
        public Builder categories(java.util.List<LogAnalyticsCategory> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }
        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
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
         * Compartment Identifier [OCID]
         * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsLookup build() {
            LogAnalyticsLookup model =
                    new LogAnalyticsLookup(
                            this.activeEditVersion,
                            this.canonicalLink,
                            this.description,
                            this.editVersion,
                            this.fields,
                            this.lookupReference,
                            this.lookupReferenceString,
                            this.type,
                            this.name,
                            this.isBuiltIn,
                            this.isHidden,
                            this.lookupDisplayName,
                            this.referringSources,
                            this.statusSummary,
                            this.timeUpdated,
                            this.categories,
                            this.id,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsLookup model) {
            if (model.wasPropertyExplicitlySet("activeEditVersion")) {
                this.activeEditVersion(model.getActiveEditVersion());
            }
            if (model.wasPropertyExplicitlySet("canonicalLink")) {
                this.canonicalLink(model.getCanonicalLink());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("lookupReference")) {
                this.lookupReference(model.getLookupReference());
            }
            if (model.wasPropertyExplicitlySet("lookupReferenceString")) {
                this.lookupReferenceString(model.getLookupReferenceString());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isBuiltIn")) {
                this.isBuiltIn(model.getIsBuiltIn());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("lookupDisplayName")) {
                this.lookupDisplayName(model.getLookupDisplayName());
            }
            if (model.wasPropertyExplicitlySet("referringSources")) {
                this.referringSources(model.getReferringSources());
            }
            if (model.wasPropertyExplicitlySet("statusSummary")) {
                this.statusSummary(model.getStatusSummary());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** The active edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("activeEditVersion")
    private final Long activeEditVersion;

    /**
     * The active edit version.
     *
     * @return the value
     */
    public Long getActiveEditVersion() {
        return activeEditVersion;
    }

    /** The canonical link. */
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
    private final String canonicalLink;

    /**
     * The canonical link.
     *
     * @return the value
     */
    public String getCanonicalLink() {
        return canonicalLink;
    }

    /** The lookup description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The lookup description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /** The lookup fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<LookupField> fields;

    /**
     * The lookup fields.
     *
     * @return the value
     */
    public java.util.List<LookupField> getFields() {
        return fields;
    }

    /** The lookup reference as an integer. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
    private final Long lookupReference;

    /**
     * The lookup reference as an integer.
     *
     * @return the value
     */
    public Long getLookupReference() {
        return lookupReference;
    }

    /** The lookup reference as a string. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupReferenceString")
    private final String lookupReferenceString;

    /**
     * The lookup reference as a string.
     *
     * @return the value
     */
    public String getLookupReferenceString() {
        return lookupReferenceString;
    }

    /** The lookup type. Valid values are Lookup, Dictionary or Module. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Lookup("Lookup"),
        Dictionary("Dictionary"),
        Module("Module"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The lookup type. Valid values are Lookup, Dictionary or Module. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The lookup type. Valid values are Lookup, Dictionary or Module.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The lookup name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The lookup name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A flag indicating if the lookup is custom (user-defined) or built in. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBuiltIn")
    private final Long isBuiltIn;

    /**
     * A flag indicating if the lookup is custom (user-defined) or built in.
     *
     * @return the value
     */
    public Long getIsBuiltIn() {
        return isBuiltIn;
    }

    /**
     * A flag indicating if the lookup is hidden or not. A hidden lookup will not be returned in
     * list operations by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    /**
     * A flag indicating if the lookup is hidden or not. A hidden lookup will not be returned in
     * list operations by default.
     *
     * @return the value
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    /** The lookup display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
    private final String lookupDisplayName;

    /**
     * The lookup display name.
     *
     * @return the value
     */
    public String getLookupDisplayName() {
        return lookupDisplayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("referringSources")
    private final AutoLookups referringSources;

    public AutoLookups getReferringSources() {
        return referringSources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statusSummary")
    private final StatusSummary statusSummary;

    public StatusSummary getStatusSummary() {
        return statusSummary;
    }

    /** The last updated date. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last updated date.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * An array of categories assigned to this lookup. The isSystem flag denotes if each category
     * assignment is user-created or Oracle-defined.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<LogAnalyticsCategory> categories;

    /**
     * An array of categories assigned to this lookup. The isSystem flag denotes if each category
     * assignment is user-created or Oracle-defined.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsCategory> getCategories() {
        return categories;
    }

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Compartment Identifier [OCID]
     * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
        sb.append("LogAnalyticsLookup(");
        sb.append("super=").append(super.toString());
        sb.append("activeEditVersion=").append(String.valueOf(this.activeEditVersion));
        sb.append(", canonicalLink=").append(String.valueOf(this.canonicalLink));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", lookupReference=").append(String.valueOf(this.lookupReference));
        sb.append(", lookupReferenceString=").append(String.valueOf(this.lookupReferenceString));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isBuiltIn=").append(String.valueOf(this.isBuiltIn));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", lookupDisplayName=").append(String.valueOf(this.lookupDisplayName));
        sb.append(", referringSources=").append(String.valueOf(this.referringSources));
        sb.append(", statusSummary=").append(String.valueOf(this.statusSummary));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof LogAnalyticsLookup)) {
            return false;
        }

        LogAnalyticsLookup other = (LogAnalyticsLookup) o;
        return java.util.Objects.equals(this.activeEditVersion, other.activeEditVersion)
                && java.util.Objects.equals(this.canonicalLink, other.canonicalLink)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.lookupReference, other.lookupReference)
                && java.util.Objects.equals(this.lookupReferenceString, other.lookupReferenceString)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isBuiltIn, other.isBuiltIn)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.lookupDisplayName, other.lookupDisplayName)
                && java.util.Objects.equals(this.referringSources, other.referringSources)
                && java.util.Objects.equals(this.statusSummary, other.statusSummary)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activeEditVersion == null ? 43 : this.activeEditVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.canonicalLink == null ? 43 : this.canonicalLink.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupReference == null ? 43 : this.lookupReference.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupReferenceString == null
                                ? 43
                                : this.lookupReferenceString.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isBuiltIn == null ? 43 : this.isBuiltIn.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupDisplayName == null ? 43 : this.lookupDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.referringSources == null ? 43 : this.referringSources.hashCode());
        result =
                (result * PRIME)
                        + (this.statusSummary == null ? 43 : this.statusSummary.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
