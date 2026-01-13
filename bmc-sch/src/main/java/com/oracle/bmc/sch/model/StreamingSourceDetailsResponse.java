/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The Streaming source response. Private metadata is included when the target is a stream accessed
 * through a [private
 * endpoint](https://docs.oracle.com/iaas/Content/Streaming/Concepts/streamsecurity.htm#private_endpoints).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StreamingSourceDetailsResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StreamingSourceDetailsResponse extends SourceDetailsResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointMetadata")
        private PrivateEndpointMetadata privateEndpointMetadata;

        public Builder privateEndpointMetadata(PrivateEndpointMetadata privateEndpointMetadata) {
            this.privateEndpointMetadata = privateEndpointMetadata;
            this.__explicitlySet__.add("privateEndpointMetadata");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * stream.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streamId")
        private String streamId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * stream.
         *
         * @param streamId the value to set
         * @return this builder
         */
        public Builder streamId(String streamId) {
            this.streamId = streamId;
            this.__explicitlySet__.add("streamId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cursor")
        private StreamingCursorDetails cursor;

        public Builder cursor(StreamingCursorDetails cursor) {
            this.cursor = cursor;
            this.__explicitlySet__.add("cursor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StreamingSourceDetailsResponse build() {
            StreamingSourceDetailsResponse model =
                    new StreamingSourceDetailsResponse(
                            this.privateEndpointMetadata, this.streamId, this.cursor);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StreamingSourceDetailsResponse model) {
            if (model.wasPropertyExplicitlySet("privateEndpointMetadata")) {
                this.privateEndpointMetadata(model.getPrivateEndpointMetadata());
            }
            if (model.wasPropertyExplicitlySet("streamId")) {
                this.streamId(model.getStreamId());
            }
            if (model.wasPropertyExplicitlySet("cursor")) {
                this.cursor(model.getCursor());
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
    public StreamingSourceDetailsResponse(
            PrivateEndpointMetadata privateEndpointMetadata,
            String streamId,
            StreamingCursorDetails cursor) {
        super(privateEndpointMetadata);
        this.streamId = streamId;
        this.cursor = cursor;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * stream.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streamId")
    private final String streamId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * stream.
     *
     * @return the value
     */
    public String getStreamId() {
        return streamId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cursor")
    private final StreamingCursorDetails cursor;

    public StreamingCursorDetails getCursor() {
        return cursor;
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
        sb.append("StreamingSourceDetailsResponse(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", streamId=").append(String.valueOf(this.streamId));
        sb.append(", cursor=").append(String.valueOf(this.cursor));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamingSourceDetailsResponse)) {
            return false;
        }

        StreamingSourceDetailsResponse other = (StreamingSourceDetailsResponse) o;
        return java.util.Objects.equals(this.streamId, other.streamId)
                && java.util.Objects.equals(this.cursor, other.cursor)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.streamId == null ? 43 : this.streamId.hashCode());
        result = (result * PRIME) + (this.cursor == null ? 43 : this.cursor.hashCode());
        return result;
    }
}
