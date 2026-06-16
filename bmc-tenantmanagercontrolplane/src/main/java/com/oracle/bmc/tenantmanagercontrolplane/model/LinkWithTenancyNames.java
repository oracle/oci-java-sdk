/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * A link between a parent tenancy and a child tenancy, including the parent and child tenancy
 * names. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LinkWithTenancyNames.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LinkWithTenancyNames
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parentTenancyName",
        "childTenancyName",
        "id",
        "parentTenancyId",
        "childTenancyId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "timeTerminated",
        "feature"
    })
    public LinkWithTenancyNames(
            String parentTenancyName,
            String childTenancyName,
            String id,
            String parentTenancyId,
            String childTenancyId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeTerminated,
            String feature) {
        super();
        this.parentTenancyName = parentTenancyName;
        this.childTenancyName = childTenancyName;
        this.id = id;
        this.parentTenancyId = parentTenancyId;
        this.childTenancyId = childTenancyId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeTerminated = timeTerminated;
        this.feature = feature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the parent tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTenancyName")
        private String parentTenancyName;

        /**
         * Name of the parent tenancy.
         *
         * @param parentTenancyName the value to set
         * @return this builder
         */
        public Builder parentTenancyName(String parentTenancyName) {
            this.parentTenancyName = parentTenancyName;
            this.__explicitlySet__.add("parentTenancyName");
            return this;
        }
        /** Name of the child tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("childTenancyName")
        private String childTenancyName;

        /**
         * Name of the child tenancy.
         *
         * @param childTenancyName the value to set
         * @return this builder
         */
        public Builder childTenancyName(String childTenancyName) {
            this.childTenancyName = childTenancyName;
            this.__explicitlySet__.add("childTenancyName");
            return this;
        }
        /** OCID of the link. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the link.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID of the parent tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTenancyId")
        private String parentTenancyId;

        /**
         * OCID of the parent tenancy.
         *
         * @param parentTenancyId the value to set
         * @return this builder
         */
        public Builder parentTenancyId(String parentTenancyId) {
            this.parentTenancyId = parentTenancyId;
            this.__explicitlySet__.add("parentTenancyId");
            return this;
        }
        /** OCID of the child tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("childTenancyId")
        private String childTenancyId;

        /**
         * OCID of the child tenancy.
         *
         * @param childTenancyId the value to set
         * @return this builder
         */
        public Builder childTenancyId(String childTenancyId) {
            this.childTenancyId = childTenancyId;
            this.__explicitlySet__.add("childTenancyId");
            return this;
        }
        /** Lifecycle state of the link. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle state of the link.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Date-time when this link was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date-time when this link was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Date-time when this link was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date-time when this link was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Date-time when this link was terminated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
        private java.util.Date timeTerminated;

        /**
         * Date-time when this link was terminated.
         *
         * @param timeTerminated the value to set
         * @return this builder
         */
        public Builder timeTerminated(java.util.Date timeTerminated) {
            this.timeTerminated = timeTerminated;
            this.__explicitlySet__.add("timeTerminated");
            return this;
        }
        /** The feature associated with this link. Default value is CORE. */
        @com.fasterxml.jackson.annotation.JsonProperty("feature")
        private String feature;

        /**
         * The feature associated with this link. Default value is CORE.
         *
         * @param feature the value to set
         * @return this builder
         */
        public Builder feature(String feature) {
            this.feature = feature;
            this.__explicitlySet__.add("feature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LinkWithTenancyNames build() {
            LinkWithTenancyNames model =
                    new LinkWithTenancyNames(
                            this.parentTenancyName,
                            this.childTenancyName,
                            this.id,
                            this.parentTenancyId,
                            this.childTenancyId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeTerminated,
                            this.feature);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LinkWithTenancyNames model) {
            if (model.wasPropertyExplicitlySet("parentTenancyName")) {
                this.parentTenancyName(model.getParentTenancyName());
            }
            if (model.wasPropertyExplicitlySet("childTenancyName")) {
                this.childTenancyName(model.getChildTenancyName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("parentTenancyId")) {
                this.parentTenancyId(model.getParentTenancyId());
            }
            if (model.wasPropertyExplicitlySet("childTenancyId")) {
                this.childTenancyId(model.getChildTenancyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeTerminated")) {
                this.timeTerminated(model.getTimeTerminated());
            }
            if (model.wasPropertyExplicitlySet("feature")) {
                this.feature(model.getFeature());
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

    /** Name of the parent tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTenancyName")
    private final String parentTenancyName;

    /**
     * Name of the parent tenancy.
     *
     * @return the value
     */
    public String getParentTenancyName() {
        return parentTenancyName;
    }

    /** Name of the child tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("childTenancyName")
    private final String childTenancyName;

    /**
     * Name of the child tenancy.
     *
     * @return the value
     */
    public String getChildTenancyName() {
        return childTenancyName;
    }

    /** OCID of the link. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the link.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID of the parent tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTenancyId")
    private final String parentTenancyId;

    /**
     * OCID of the parent tenancy.
     *
     * @return the value
     */
    public String getParentTenancyId() {
        return parentTenancyId;
    }

    /** OCID of the child tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("childTenancyId")
    private final String childTenancyId;

    /**
     * OCID of the child tenancy.
     *
     * @return the value
     */
    public String getChildTenancyId() {
        return childTenancyId;
    }

    /** Lifecycle state of the link. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle state of the link.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Date-time when this link was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date-time when this link was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Date-time when this link was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date-time when this link was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Date-time when this link was terminated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
    private final java.util.Date timeTerminated;

    /**
     * Date-time when this link was terminated.
     *
     * @return the value
     */
    public java.util.Date getTimeTerminated() {
        return timeTerminated;
    }

    /** The feature associated with this link. Default value is CORE. */
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final String feature;

    /**
     * The feature associated with this link. Default value is CORE.
     *
     * @return the value
     */
    public String getFeature() {
        return feature;
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
        sb.append("LinkWithTenancyNames(");
        sb.append("super=").append(super.toString());
        sb.append("parentTenancyName=").append(String.valueOf(this.parentTenancyName));
        sb.append(", childTenancyName=").append(String.valueOf(this.childTenancyName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", parentTenancyId=").append(String.valueOf(this.parentTenancyId));
        sb.append(", childTenancyId=").append(String.valueOf(this.childTenancyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeTerminated=").append(String.valueOf(this.timeTerminated));
        sb.append(", feature=").append(String.valueOf(this.feature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkWithTenancyNames)) {
            return false;
        }

        LinkWithTenancyNames other = (LinkWithTenancyNames) o;
        return java.util.Objects.equals(this.parentTenancyName, other.parentTenancyName)
                && java.util.Objects.equals(this.childTenancyName, other.childTenancyName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.parentTenancyId, other.parentTenancyId)
                && java.util.Objects.equals(this.childTenancyId, other.childTenancyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeTerminated, other.timeTerminated)
                && java.util.Objects.equals(this.feature, other.feature)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.parentTenancyName == null ? 43 : this.parentTenancyName.hashCode());
        result =
                (result * PRIME)
                        + (this.childTenancyName == null ? 43 : this.childTenancyName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTenancyId == null ? 43 : this.parentTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.childTenancyId == null ? 43 : this.childTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTerminated == null ? 43 : this.timeTerminated.hashCode());
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
