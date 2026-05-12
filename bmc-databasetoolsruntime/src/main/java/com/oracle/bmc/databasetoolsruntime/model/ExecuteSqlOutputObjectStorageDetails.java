/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Object Storage resource output details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExecuteSqlOutputObjectStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecuteSqlOutputObjectStorageDetails extends ExecuteSqlOutputDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resultDispositionTemplates")
        private java.util.List<ExecuteSqlOutputResultDispositionTemplate>
                resultDispositionTemplates;

        public Builder resultDispositionTemplates(
                java.util.List<ExecuteSqlOutputResultDispositionTemplate>
                        resultDispositionTemplates) {
            this.resultDispositionTemplates = resultDispositionTemplates;
            this.__explicitlySet__.add("resultDispositionTemplates");
            return this;
        }
        /**
         * The time when the object becomes eligible for deletion, expressed as an RFC 3339
         * date-time string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * The time when the object becomes eligible for deletion, expressed as an RFC 3339
         * date-time string.
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private ExecuteSqlObjectStorageLocation object;

        public Builder object(ExecuteSqlObjectStorageLocation object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlOutputObjectStorageDetails build() {
            ExecuteSqlOutputObjectStorageDetails model =
                    new ExecuteSqlOutputObjectStorageDetails(
                            this.resultDispositionTemplates, this.timeOfDeletion, this.object);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlOutputObjectStorageDetails model) {
            if (model.wasPropertyExplicitlySet("resultDispositionTemplates")) {
                this.resultDispositionTemplates(model.getResultDispositionTemplates());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
            }
            if (model.wasPropertyExplicitlySet("object")) {
                this.object(model.getObject());
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

    @Deprecated
    public ExecuteSqlOutputObjectStorageDetails(
            java.util.List<ExecuteSqlOutputResultDispositionTemplate> resultDispositionTemplates,
            java.util.Date timeOfDeletion,
            ExecuteSqlObjectStorageLocation object) {
        super(resultDispositionTemplates);
        this.timeOfDeletion = timeOfDeletion;
        this.object = object;
    }

    /**
     * The time when the object becomes eligible for deletion, expressed as an RFC 3339 date-time
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * The time when the object becomes eligible for deletion, expressed as an RFC 3339 date-time
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("object")
    private final ExecuteSqlObjectStorageLocation object;

    public ExecuteSqlObjectStorageLocation getObject() {
        return object;
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
        sb.append("ExecuteSqlOutputObjectStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", object=").append(String.valueOf(this.object));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlOutputObjectStorageDetails)) {
            return false;
        }

        ExecuteSqlOutputObjectStorageDetails other = (ExecuteSqlOutputObjectStorageDetails) o;
        return java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.object, other.object)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        return result;
    }
}
