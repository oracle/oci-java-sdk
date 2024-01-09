/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not
 * authorized, talk to an administrator. If you are an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RenameObjectDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RenameObjectDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceName",
        "newName",
        "srcObjIfMatchETag",
        "newObjIfMatchETag",
        "newObjIfNoneMatchETag"
    })
    public RenameObjectDetails(
            String sourceName,
            String newName,
            String srcObjIfMatchETag,
            String newObjIfMatchETag,
            String newObjIfNoneMatchETag) {
        super();
        this.sourceName = sourceName;
        this.newName = newName;
        this.srcObjIfMatchETag = srcObjIfMatchETag;
        this.newObjIfMatchETag = newObjIfMatchETag;
        this.newObjIfNoneMatchETag = newObjIfNoneMatchETag;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the source object to be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The name of the source object to be renamed.
         *
         * @param sourceName the value to set
         * @return this builder
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /** The new name of the source object. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("newName")
        private String newName;

        /**
         * The new name of the source object. Avoid entering confidential information.
         *
         * @param newName the value to set
         * @return this builder
         */
        public Builder newName(String newName) {
            this.newName = newName;
            this.__explicitlySet__.add("newName");
            return this;
        }
        /** The if-match entity tag (ETag) of the source object. */
        @com.fasterxml.jackson.annotation.JsonProperty("srcObjIfMatchETag")
        private String srcObjIfMatchETag;

        /**
         * The if-match entity tag (ETag) of the source object.
         *
         * @param srcObjIfMatchETag the value to set
         * @return this builder
         */
        public Builder srcObjIfMatchETag(String srcObjIfMatchETag) {
            this.srcObjIfMatchETag = srcObjIfMatchETag;
            this.__explicitlySet__.add("srcObjIfMatchETag");
            return this;
        }
        /** The if-match entity tag (ETag) of the new object. */
        @com.fasterxml.jackson.annotation.JsonProperty("newObjIfMatchETag")
        private String newObjIfMatchETag;

        /**
         * The if-match entity tag (ETag) of the new object.
         *
         * @param newObjIfMatchETag the value to set
         * @return this builder
         */
        public Builder newObjIfMatchETag(String newObjIfMatchETag) {
            this.newObjIfMatchETag = newObjIfMatchETag;
            this.__explicitlySet__.add("newObjIfMatchETag");
            return this;
        }
        /**
         * The if-none-match entity tag (ETag) of the new object. The only valid value is '*', which
         * indicates request should fail if the new object already exists.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("newObjIfNoneMatchETag")
        private String newObjIfNoneMatchETag;

        /**
         * The if-none-match entity tag (ETag) of the new object. The only valid value is '*', which
         * indicates request should fail if the new object already exists.
         *
         * @param newObjIfNoneMatchETag the value to set
         * @return this builder
         */
        public Builder newObjIfNoneMatchETag(String newObjIfNoneMatchETag) {
            this.newObjIfNoneMatchETag = newObjIfNoneMatchETag;
            this.__explicitlySet__.add("newObjIfNoneMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenameObjectDetails build() {
            RenameObjectDetails model =
                    new RenameObjectDetails(
                            this.sourceName,
                            this.newName,
                            this.srcObjIfMatchETag,
                            this.newObjIfMatchETag,
                            this.newObjIfNoneMatchETag);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameObjectDetails model) {
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("newName")) {
                this.newName(model.getNewName());
            }
            if (model.wasPropertyExplicitlySet("srcObjIfMatchETag")) {
                this.srcObjIfMatchETag(model.getSrcObjIfMatchETag());
            }
            if (model.wasPropertyExplicitlySet("newObjIfMatchETag")) {
                this.newObjIfMatchETag(model.getNewObjIfMatchETag());
            }
            if (model.wasPropertyExplicitlySet("newObjIfNoneMatchETag")) {
                this.newObjIfNoneMatchETag(model.getNewObjIfNoneMatchETag());
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

    /** The name of the source object to be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The name of the source object to be renamed.
     *
     * @return the value
     */
    public String getSourceName() {
        return sourceName;
    }

    /** The new name of the source object. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("newName")
    private final String newName;

    /**
     * The new name of the source object. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getNewName() {
        return newName;
    }

    /** The if-match entity tag (ETag) of the source object. */
    @com.fasterxml.jackson.annotation.JsonProperty("srcObjIfMatchETag")
    private final String srcObjIfMatchETag;

    /**
     * The if-match entity tag (ETag) of the source object.
     *
     * @return the value
     */
    public String getSrcObjIfMatchETag() {
        return srcObjIfMatchETag;
    }

    /** The if-match entity tag (ETag) of the new object. */
    @com.fasterxml.jackson.annotation.JsonProperty("newObjIfMatchETag")
    private final String newObjIfMatchETag;

    /**
     * The if-match entity tag (ETag) of the new object.
     *
     * @return the value
     */
    public String getNewObjIfMatchETag() {
        return newObjIfMatchETag;
    }

    /**
     * The if-none-match entity tag (ETag) of the new object. The only valid value is '*', which
     * indicates request should fail if the new object already exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("newObjIfNoneMatchETag")
    private final String newObjIfNoneMatchETag;

    /**
     * The if-none-match entity tag (ETag) of the new object. The only valid value is '*', which
     * indicates request should fail if the new object already exists.
     *
     * @return the value
     */
    public String getNewObjIfNoneMatchETag() {
        return newObjIfNoneMatchETag;
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
        sb.append("RenameObjectDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", newName=").append(String.valueOf(this.newName));
        sb.append(", srcObjIfMatchETag=").append(String.valueOf(this.srcObjIfMatchETag));
        sb.append(", newObjIfMatchETag=").append(String.valueOf(this.newObjIfMatchETag));
        sb.append(", newObjIfNoneMatchETag=").append(String.valueOf(this.newObjIfNoneMatchETag));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenameObjectDetails)) {
            return false;
        }

        RenameObjectDetails other = (RenameObjectDetails) o;
        return java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.newName, other.newName)
                && java.util.Objects.equals(this.srcObjIfMatchETag, other.srcObjIfMatchETag)
                && java.util.Objects.equals(this.newObjIfMatchETag, other.newObjIfMatchETag)
                && java.util.Objects.equals(this.newObjIfNoneMatchETag, other.newObjIfNoneMatchETag)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result = (result * PRIME) + (this.newName == null ? 43 : this.newName.hashCode());
        result =
                (result * PRIME)
                        + (this.srcObjIfMatchETag == null ? 43 : this.srcObjIfMatchETag.hashCode());
        result =
                (result * PRIME)
                        + (this.newObjIfMatchETag == null ? 43 : this.newObjIfMatchETag.hashCode());
        result =
                (result * PRIME)
                        + (this.newObjIfNoneMatchETag == null
                                ? 43
                                : this.newObjIfNoneMatchETag.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
