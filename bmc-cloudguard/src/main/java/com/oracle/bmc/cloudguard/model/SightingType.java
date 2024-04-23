/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Information for a sighting type <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SightingType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SightingType extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The unique identifier of the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier of the sighting type
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name of the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the sighting type
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the sighting type
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** MITRE ATT@CK framework link for the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("mitreLink")
        private String mitreLink;

        /**
         * MITRE ATT@CK framework link for the sighting type
         *
         * @param mitreLink the value to set
         * @return this builder
         */
        public Builder mitreLink(String mitreLink) {
            this.mitreLink = mitreLink;
            this.__explicitlySet__.add("mitreLink");
            return this;
        }
        /** MITRE ATT@CK framework tactic for the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("tactic")
        private String tactic;

        /**
         * MITRE ATT@CK framework tactic for the sighting type
         *
         * @param tactic the value to set
         * @return this builder
         */
        public Builder tactic(String tactic) {
            this.tactic = tactic;
            this.__explicitlySet__.add("tactic");
            return this;
        }
        /** List of MITRE ATT@CK framework techniques for the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("techniques")
        private java.util.List<String> techniques;

        /**
         * List of MITRE ATT@CK framework techniques for the sighting type
         *
         * @param techniques the value to set
         * @return this builder
         */
        public Builder techniques(java.util.List<String> techniques) {
            this.techniques = techniques;
            this.__explicitlySet__.add("techniques");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SightingType build() {
            SightingType model =
                    new SightingType(
                            this.id,
                            this.displayName,
                            this.description,
                            this.mitreLink,
                            this.tactic,
                            this.techniques);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SightingType model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("mitreLink")) {
                this.mitreLink(model.getMitreLink());
            }
            if (model.wasPropertyExplicitlySet("tactic")) {
                this.tactic(model.getTactic());
            }
            if (model.wasPropertyExplicitlySet("techniques")) {
                this.techniques(model.getTechniques());
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

    /** The unique identifier of the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier of the sighting type
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name of the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the sighting type
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the sighting type
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** MITRE ATT@CK framework link for the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("mitreLink")
    private final String mitreLink;

    /**
     * MITRE ATT@CK framework link for the sighting type
     *
     * @return the value
     */
    public String getMitreLink() {
        return mitreLink;
    }

    /** MITRE ATT@CK framework tactic for the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("tactic")
    private final String tactic;

    /**
     * MITRE ATT@CK framework tactic for the sighting type
     *
     * @return the value
     */
    public String getTactic() {
        return tactic;
    }

    /** List of MITRE ATT@CK framework techniques for the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("techniques")
    private final java.util.List<String> techniques;

    /**
     * List of MITRE ATT@CK framework techniques for the sighting type
     *
     * @return the value
     */
    public java.util.List<String> getTechniques() {
        return techniques;
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
        sb.append("SightingType(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", mitreLink=").append(String.valueOf(this.mitreLink));
        sb.append(", tactic=").append(String.valueOf(this.tactic));
        sb.append(", techniques=").append(String.valueOf(this.techniques));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
