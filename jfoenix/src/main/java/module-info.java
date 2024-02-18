module com.jfoenix{
    requires javafx.controls;
    requires javafx.graphics;
    requires java.logging;
    requires java.xml;
    requires jdk.unsupported;

    exports com.jfoenix.assets;
    exports com.jfoenix.cache;
    exports com.jfoenix.controls;
    exports com.jfoenix.effects;
    exports com.jfoenix.responsive;
    exports com.jfoenix.skins;
    exports com.jfoenix.svg;
    exports com.jfoenix.validation;
    exports com.jfoenix.validation.base;
    exports com.jfoenix.transitions;
    exports com.jfoenix.animation;
    exports com.jfoenix.transitions.hamburger;
    exports com.jfoenix.utils;

    exports com.jfoenix.controls.datamodels.treetable;
    exports com.jfoenix.controls.events;
    exports com.jfoenix.controls.base;
    exports com.jfoenix.controls.cells.editors;
    exports com.jfoenix.controls.cells.editors.base;
    exports com.jfoenix.animation.alert;

    opens com.jfoenix.assets.css;
    opens com.jfoenix.assets.css.controls;
    opens com.jfoenix.assets.font.roboto;
}