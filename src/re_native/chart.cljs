(ns re-native.chart
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-chart (js/require "react-native-chart"))
(def Chart (aget react-native-chart "default"))

(assert react-native-chart)
(assert Chart)

(def chart (r/adapt-react-class Chart))
