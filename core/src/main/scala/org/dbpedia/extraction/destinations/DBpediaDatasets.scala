package org.dbpedia.extraction.destinations
/**
 * Defines the datasets which are extracted by DBpedia.
 * TODO: add references to the extractor classes.
 */
object DBpediaDatasets
{
    /**
      * Source
      */
    val PagesArticles = new Dataset("pages_articles", "The Wikipedia dump file, which is the source for all other extracted datasets.")

    /**
     * General
     */
    val Labels = new Dataset("labels", "Titles of all Wikipedia Articles in the corresponding language.")
    val CategoryLabels = new Dataset("category_labels","Labels for Categories.")
    val Images = new Dataset("images", "Main image and corresponding thumbnail from Wikipedia article.")
    val GeoCoordinates = new Dataset("geo_coordinates", "Geographic coordinates extracted from Wikipedia.")
    val Persondata = new Dataset("persondata", "Information about persons (date and place of birth etc., extracted from the English and German Wikipedia, represented using the FOAF vocabulary.")
    val Pnd = new Dataset("pnd", "")
    val Redirects = new Dataset("redirects", "Dataset containing redirects between articles in Wikipedia.")
    val RedirectsTransitive = new Dataset("transitive-redirects", "Dataset containing transitively resolved redirects between articles in Wikipedia.")
    val ArticleCategories = new Dataset("article_categories", "Links from concepts to categories using the SKOS vocabulary.")
    val ArticleTemplates = new Dataset("article_templates", "Templates used in an article (top-level)")
    val ArticleTemplatesNested = new Dataset("article_templates_nested", "Templates used in an article (nested)")
    val SkosCategories = new Dataset("skos_categories", "Information which concept is a category and how categories are related using the SKOS Vocabulary.")
    val RevisionUris = new Dataset("revision_uris", "Dataset linking DBpedia resource to the specific Wikipedia article revision used in this DBpedia release.")
    val RevisionIds = new Dataset("revision_ids", "Dataset linking a DBpedia resource to the revision ID of the Wikipedia article the data was extracted from.")
    val RevisionMeta = new Dataset("revision_meta", "Dataset containing additional revision information")
    val PageIds = new Dataset("page_ids", "Dataset linking a DBpedia resource to the page ID of the Wikipedia article the data was extracted from.")
    val InterLanguageLinks = new Dataset("interlanguage_links", "Dataset linking a DBpedia resource to the same resource in other languages and in Wikidata.") // Since the inter-language links were moved from Wikipedia to Wikidata, we now extract these links from the Wikidata dump, not from Wikipedia pages.")
    val InterLanguageLinksChapter = new Dataset("interlanguage_links_chapters", "Chapter specific interlanguage links only contains the interlanguage links between those languages for which a DBpedia mapping chapter exists and provides dereferencable URIs. (a subset of interlanguage links)")
    val Genders = new Dataset("genders", "Dataset trying to identify the gender of a resource")
    val TopicalConcepts = new Dataset("topical_concepts", "Resources that describe a category")
    val UriSameAsIri = new Dataset("uri_same_as_iri", "The owl:sameAs links between the IRI and URI format of DBpedia resources. Only extracted when IRI and URI are actually different.")
    //deprecated!  val FlickrWrapprLinks = new Dataset("flickr_wrappr_links")
    val PageLength = new Dataset("page_length", "Numbers of characters contained in a Wikipedia article's source.")
    val ImageGalleries = new Dataset("image_galleries", "An image gallery for a resource")
    val ImageAnnotations = new Dataset("image_annotations", "Annotations of image regions")
    val KMLFiles = new Dataset("kml_files", "Description of KML files from Commons")
    val AnchorText = new Dataset("anchor_text", "Texts used in links to refer to Wikipedia articles from other Wikipedia articles.")
    val SurfaceForms = new Dataset("surface_forms", "Texts used to refer to Wikipedia articles. Includes the anchor texts data, the names of redirects pointing to an article and the actual article name.")
    val Sounds = new Dataset("sounds", "audio files and sounds from Wikipedia articles.")

    /**
     * Mapping based
     */
    val OntologyTypes = new Dataset("instance_types", "Contains triples of the form $object rdf:type $class from the mapping-based extraction.")
    val OntologyTypesTransitive = new Dataset("instance_types_transitive", "Contains transitive rdf:type $class based on the DBpedia ontology.")
    val OntologyPropertiesObjects = new Dataset("mappingbased_objects_uncleaned")
    val OntologyPropertiesLiterals = new Dataset("mappingbased_literals", "High-quality data extracted from Infoboxes using the mapping-based extraction (Literal properties only). The predicates in this dataset are in the ontology namespace. Note that this data is of much higher quality than the Raw Infobox Properties in the 'property' namespace.")  //For example, there are three different raw Wikipedia infobox properties for the birth date of a person. In the the /ontology/ namespace, they are all **mapped onto one relation** http://dbpedia.org/ontology/birthDate. It is a strong point of DBpedia to unify these relations.")
    val OntologyPropertiesGeo = new Dataset("geo_coordinates_mappingbased", "Geographic coordinates extracted from Wikipedia originating from mapped infoboxes in the mappings wiki")
    val SpecificProperties = new Dataset("specific_mappingbased_properties", "Infobox data from the mapping-based extraction, using units of measurement more convenient for the resource type, e.g. square kilometres instead of square metres for the area of a city.")

    val OntologyPropertiesObjectsCleaned = new Dataset("mappingbased-objects", "High-quality data extracted from Infoboxes using the mapping-based extraction (Object properties only). The predicates in this dataset are in the 'ontology' namespace. Note that this data is of much higher quality than the Raw Infobox Properties in the 'property' namespace.") // For example, there are three different raw Wikipedia infobox properties for the birth date of a person. In the the /ontology/ namespace, they are all **mapped onto one relation** http://dbpedia.org/ontology/birthDate. It is a strong point of DBpedia to unify these relations.")
    val OntologyPropertiesDisjointRange = new Dataset("mappingbased-objects-disjoint-range", "Errors detected in the mapping based properties (disjoint range).")
    val OntologyPropertiesDisjointDomain = new Dataset("mappingbased-objects-disjoint-domain", "Errors detected in the mapping based properties (disjoint domain).")

    val LhdDboInstanceTypes = new Dataset("instance_types_lhd_dbo", "Linked Hypernyms Inference dataset attaches entity articles with a DBpedia ontology concept as their type. The types are hypernyms mined from articles' free text using hand-crafted lexico-syntactic patterns, the mapping to DBpedia ontology type was performed with exact string matching and type co-occurrence analysis.")
    val LhdExtInstanceTypes = new Dataset("instance_types_lhd_ext", "Linked Hypernym Extension dataset attaches entity articles with a DBpedia resource as their type. The types are hypernyms mined from articles' free text using hand-crafted lexicosyntactic patterns. Unlike the  Inference dataset the Extension dataset contains more specific types, since the set of types is not constrained to DBpedia Ontology - any DBpedia resource can serve as a type.")
    val TaxDboInstanceTypes = new Dataset("instance_types_dbtax_dbo", "DBTax is a data-driven approach to convert the Wikipedia category system into an extensive general-purpose taxonomy, the types of which can be automatically assigned to resources. This set is its result for DBpedia where the inferred type has an equivalent in the DBpedia ontology.")
    val TaxExtInstanceTypes = new Dataset("instance_types_dbtax_ext", "DBTax is a data-driven approach to convert the Wikipedia category system into an extensive general-purpose taxonomy, the types of which can be automatically assigned to resources. This set is its result for DBpedia where the inferred type has no known equivalent in the DBpedia ontology.")
    val SDInstanceTypes = new Dataset("instance_types_sdtyped_dbo", "The SDType heuristic can extract probable type information in large, cross-domain databases on noisy data. This is its result for DBpedia which supplements the normally gathered instance types. This set is its result for DBpedia where the inferred type has an equivalent in the DBpedia ontology.")

    /**
     * French population template
     */
     val FrenchPopulation = new Dataset("french_population", "French dataset about population.")

    /**
     *  Infobox
     */
    val InfoboxProperties = new Dataset("infobox_properties", "Information that has been extracted from Wikipedia infoboxes. Note that this data is in the less clean 'property' namespace. The Mapping-based Properties in the 'ontology' namespace, should always be preferred over this data.")
    val InfoboxPropertiesMapped = new Dataset("infobox_properties_mapped", "Information that has been extracted from Wikipedia infoboxes. Note that this data is in the less clean 'property' namespace. The Mapping-based Properties in the 'ontology' namespace, should always be preferred over this data. This dataset contains facts that have equivalent mapped facts in the mapping-based datasets. ")
    val InfoboxPropertyDefinitions = new Dataset("infobox_property_definitions", "All properties predicates used in infoboxes.")
    val TemplateParameters = new Dataset("template_parameters", "Dataset describing names of template parameters.")
    val InfoboxTest = new Dataset("infobox_test")

    /**
     * Abstracts
     */
    val ShortAbstracts = new Dataset("short_abstracts", "Short Abstracts (about 600 characters long) of Wikipedia articles.")
    val LongAbstracts = new Dataset("long_abstracts", "Long abstracts (full abstracts) of Wikipedia articles, usually the first section.")
    val MissingShortAbstracts = new Dataset("missing_short_abstracts")
    val MissingLongAbstracts = new Dataset("missing_long_abstracts")
    val NifAbstractContext = new Dataset("nif_abstract_context", "This is a temporary dataset for the NIF extraction of abstracts. It shall be replaced with the full page context in upcoming releases")
    val NifPageStructure = new Dataset("nif_page_structure", "This dataset contains the page structure of a Wikipedia page, divided in sections and paragraphs.")
    val NifTextLinks = new Dataset("nif_text_links", "This dataset contains all text links of a Wikipedia page, detailed in the NIF format.")

    /**
     * Links
     */
    val LinksToWikipediaArticle = new Dataset("wikipedia_links", "Dataset linking DBpedia resource to corresponding article in Wikipedia.")
    val ExternalLinks = new Dataset("external_links", "Links to external web pages about a concept.")
    val PageLinks = new Dataset("page_links", "Dataset containing internal links between DBpedia instances. The dataset was created from the internal links between Wikipedia articles. The dataset might be useful for structural analysis, data mining or for ranking DBpedia instances using Page Rank or similar algorithms.")
    val DisambiguationLinks  = new Dataset("disambiguations", "Links extracted from Wikipedia disambiguation pages. Since Wikipedia has no syntax to distinguish disambiguation links from ordinary links, DBpedia has to use heuristics.")
    val Homepages = new Dataset("homepages", "Links to homepages of persons, organizations etc.")
    val OutDegree = new Dataset("out_degree", "Number of links emerging from a Wikipedia article and pointing to another Wikipedia article.")
    val FreebaseLinks = new Dataset("freebase_links", "This file contains the back-links (owl:sameAs) to the Freebase dataset.")
    val GeonamesLinks = new Dataset("geonames_links", "This file contains the back-links (owl:sameAs) to the Geonames dataset.")
    val CommonsLink = new Dataset("commons_page_links", "Dataset containing links between a language-locale DBpedia instance and DBpedia Commons.")


    /**
     * Files
     */
    val FileInformation = new Dataset("file_information")


    /**
     * Wikidata
     */
    val WikidataLabelsMappingsWiki = new Dataset("labels")
    val WikidataLabelsRest = new Dataset("labels_nmw")
    val WikidataSameAs = new Dataset("sameas_all_wikis")
    val WikidataNameSpaceSameAs = new Dataset("sameas_wikidata")
    val WikidataSameAsExternal = new Dataset("sameas_external")
    val WikidataAliasMappingsWiki = new Dataset("alias")
    val WikidataAliasRest = new Dataset("alias_nmw")
    val WikidataDescriptionMappingsWiki = new Dataset("description")
    val WikidataDescriptionRest = new Dataset("description_nmw")
    val WikidataProperty= new Dataset("properties")
    val WikidataR2R_literals = OntologyPropertiesLiterals
    val WikidataR2R_objects = OntologyPropertiesObjects
    val WikidataR2R_ontology = new Dataset("ontology_subclassof")
    val WikidataR2R_mappingerrors = new Dataset("wikidata_r2r_mapping_errors")
    val WikidataReifiedR2R = new Dataset("mappingbased_properties_reified") // keep same name with other languages
    val WikidataReifiedR2RQualifier= new Dataset("mappingbased_properties_reified_qualifiers") // keep same name with other languages
    val WikidataRaw = new Dataset("raw_unredirected")
    val WikidataRawRedirected = new Dataset("raw")
    val WikidataRawReified = new Dataset("raw_reified")
    val WikidataRawReifiedQualifiers = new Dataset("raw_reified_qualifiers")
    val WikidataReference = new Dataset("references")
    val WikidataDublicateIriSplit = new Dataset("wikidata_duplicate_iri_split")

    /**
     * Citations
     */
    val CitationLinks = new Dataset("citation_links", "Links from a citation to a DBpedia article using the dbp:isCitedBy property")
    val CitationData = new Dataset("citation_data", "Raw data extracted from Wikipedia citation templates")
    //val CitationTypes = new Dataset("citation_types")


  /**
    * misc
    */
  val MainDataset = new Dataset("main_dataset", "DBpedia root dataset for representing all datasets of e certain language and version of DBpedia")


  /**
    * get members by name
    */
  private val members = DestinationUtils.getDatasets(this)

  //TODO update this when getting temp datasets
  def getDataset(name: String, extension: String = null) = members.get(name.trim.toLowerCase.replaceAll("-", "_").replaceAll("\\s+", "_")) match{
    case Some(d) => {
      if(extension != null)
        new Dataset(d.name, "Temp- or Extension Dataset of " + d.name, d.language.orNull, d.version.getOrElse(null), d.encoded + extension.trim, d, Seq() )
      else
        d
    }
    case None => throw new NotImplementedError("DBpediaDataset class is missing the declaration of dataset " + name.replaceAll("-", "_").replaceAll("\\s+", "_"))
  }
}
