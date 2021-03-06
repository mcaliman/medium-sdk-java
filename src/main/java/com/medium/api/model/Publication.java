/*
 * Copyright 2017 nosemaj.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.medium.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Publication is an immutable representation of a Publication channel
 * on Medium.
 */
public class Publication {

    /**
     * The name of the JSON key for the id.
     */
    private static final String JSON_KEY_ID = "id";

    /**
     * The name of the JSON key for the name.
     */
    private static final String JSON_KEY_NAME = "name";

    /**
     * The name of the JSON key for the description.
     */
    private static final String JSON_KEY_DESCRIPTION = "description";

    /**
     * The name of the JSON key for the URL.
     */
    private static final String JSON_KEY_URL = "url";

    /**
     * The name of the JSON key for the image URL.
     */
    private static final String JSON_KEY_IMAGE_URL = "imageUrl";

    /**
     * A unique identifier for the publication.
     */
    private String id;

    /**
     * The publication’s name on Medium.
     */
    private String name;

    /**
     * A short description of the publication.
     */
    private String description;

    /**
     * The URL to the publication’s homepage.
     */
    private String url;

    /**
     * The URL to the publication’s image/logo.
     */
    private String imageUrl;

    /**
     * Constructs a new Publication.
     *
     * @param id the publication id
     * @param name the publication name
     * @param description the publication description
     * @param url the publication url
     * @param imageUrl the url of the publication image/icon
     */
    @JsonCreator
    private Publication(
            @JsonProperty(JSON_KEY_ID)         final String id,
            @JsonProperty(JSON_KEY_NAME)       final String name,
            @JsonProperty(JSON_KEY_DESCRIPTION)final String description,
            @JsonProperty(JSON_KEY_URL)        final String url,
            @JsonProperty(JSON_KEY_IMAGE_URL)  final String imageUrl) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    /**
     * Constructs a new immutable instance of Publication from a
     * Publication.Builder.
     *
     * @param builder the builder from which publication attributes are
     *                taken, to construct this publication instance
     */
    private Publication(final Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.url = builder.url;
        this.imageUrl = builder.imageUrl;
    }

    /**
     * Gets the unique identifier for the publication.
     *
     * @return the publication id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the name of publication on Medium.
     *
     * @return the publication's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the short description of the publication.
     *
     * @return a description of the publication
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the URL to the publication's homepage.
     *
     * @return the link to the publication's homepage
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets the URL to the publication's image/logo.
     *
     * @return the link to the publication's image/logo
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Publication.Builder provides a simplified method of constructing
     * new instances of Publication.
     */
    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String url;
        private String imageUrl;

        /**
         * Sets the unique identifier used by the publication.
         *
         * @param id the publications's unique id
         *
         * @return the updated instance of the current builder
         */
        public Builder withId(final String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the name of the publication on Medium.
         *
         * @param name the publication's name on Medium
         *
         * @return the updated instance of the current builder
         */
        public Builder withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the short description of the publication.
         *
         * @param description the short description of the publciation
         *
         * @return the updated instance of the current builder
         */
        public Builder withDescription(final String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the URL of the publication's homepage.
         *
         * @param url the URL of the publication's homepage.
         *
         * @return the updated instance of the current builder
         */
        public Builder withUrl(final String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the URL of the publication's image/logo.
         *
         * @param imageUrl the URL of the publication's image/logo
         *
         * @return the updated instance of the current builder
         */
        public Builder withImageUrl(final String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Creates a new Publication from the options set in the
         * builder.
         *
         * @return a new instance of Publication
         */
        public Publication build() {
            return new Publication(this);
        }
    }
}

