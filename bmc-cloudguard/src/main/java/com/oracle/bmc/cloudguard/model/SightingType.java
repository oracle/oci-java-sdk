/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Specific behavior that can trigger a Sighting
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SightingType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SightingType {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "mitreLink",
        "tactic",
        "techniques"
    })
    public SightingType(
            String id,
            String displayName,
            String description,
            String mitreLink,
            String tactic,
            java.util.List<String> techniques) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.mitreLink = mitreLink;
        this.tactic = tactic;
        this.techniques = techniques;
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mitreLink")
        private String mitreLink;

        public Builder mitreLink(String mitreLink) {
            this.mitreLink = mitreLink;
            this.__explicitlySet__.add("mitreLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tactic")
        private String tactic;

        public Builder tactic(String tactic) {
            this.tactic = tactic;
            this.__explicitlySet__.add("tactic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("techniques")
        private java.util.List<String> techniques;

        public Builder techniques(java.util.List<String> techniques) {
            this.techniques = techniques;
            this.__explicitlySet__.add("techniques");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SightingType build() {
            SightingType __instance__ =
                    new SightingType(id, displayName, description, mitreLink, tactic, techniques);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SightingType o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .mitreLink(o.getMitreLink())
                            .tactic(o.getTactic())
                            .techniques(o.getTechniques());

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

    /**
     * The unique identifier of sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Name of the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Link of the sighting type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mitreLink")
    private final String mitreLink;

    public String getMitreLink() {
        return mitreLink;
    }

    /**
     * Mitre Att&ck tactic
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tactic")
    private final String tactic;

    public String getTactic() {
        return tactic;
    }

    /**
     * List of Mitre Att&ck Techniques
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("techniques")
    private final java.util.List<String> techniques;

    public java.util.List<String> getTechniques() {
        return techniques;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SightingType(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", mitreLink=").append(String.valueOf(this.mitreLink));
        sb.append(", tactic=").append(String.valueOf(this.tactic));
        sb.append(", techniques=").append(String.valueOf(this.techniques));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SightingType)) {
            return false;
        }

        SightingType other = (SightingType) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.mitreLink, other.mitreLink)
                && java.util.Objects.equals(this.tactic, other.tactic)
                && java.util.Objects.equals(this.techniques, other.techniques)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.mitreLink == null ? 43 : this.mitreLink.hashCode());
        result = (result * PRIME) + (this.tactic == null ? 43 : this.tactic.hashCode());
        result = (result * PRIME) + (this.techniques == null ? 43 : this.techniques.hashCode());
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
