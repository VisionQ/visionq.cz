(ns visionq.app
  (:require [rum.core :as rum]))

(rum/defc label [text]
  [:div
   [:div.darkness "darkness"]
   [:div.twilight
    [:div "twilight"]
    [:div.soon
     [:svg {:width "252px", :height "248px", :viewbox "0 0 252 248", :version "1.1", :xmlns "http://www.w3.org/2000/svg", :xmlns:xlink "http://www.w3.org/1999/xlink"}
 [:title "Soon"]
 [:g {:id "Soon"}
  [:path {:d "M50.49,201.9 C49.23,188.13 40.95,181.65 24.84,181.65 C10.98,181.65 1.08,189.12 1.08,201.36 C1.08,215.31 11.61,218.46 21.06,220.53 C28.62,222.15 35.64,222.42 35.64,228.9 C35.64,233.31 31.86,235.29 27.09,235.29 C21.6,235.29 18,232.86 17.55,226.38 L0.63,226.38 C1.26,241.14 10.98,247.35 27.09,247.35 C40.05,247.35 51.48,238.98 51.48,226.74 C51.48,212.79 40.95,210.54 31.5,208.47 C23.94,206.85 16.92,206.4 16.92,199.92 C16.92,195.78 20.16,193.71 24.84,193.71 C30.33,193.71 33.12,196.32 33.57,201.9 L50.49,201.9 Z M88.56,234.84 C97.92,234.84 100.89,226.11 100.89,214.5 C100.89,202.89 97.92,194.16 88.56,194.16 C79.2,194.16 76.23,202.89 76.23,214.5 C76.23,226.11 79.2,234.84 88.56,234.84 Z M88.56,247.35 C70.11,247.35 58.68,234.39 58.68,214.5 C58.68,194.61 70.11,181.65 88.56,181.65 C107.01,181.65 118.44,194.61 118.44,214.5 C118.44,234.39 107.01,247.35 88.56,247.35 Z M155.52,234.84 C164.88,234.84 167.85,226.11 167.85,214.5 C167.85,202.89 164.88,194.16 155.52,194.16 C146.16,194.16 143.19,202.89 143.19,214.5 C143.19,226.11 146.16,234.84 155.52,234.84 Z M155.52,247.35 C137.07,247.35 125.64,234.39 125.64,214.5 C125.64,194.61 137.07,181.65 155.52,181.65 C173.97,181.65 185.4,194.61 185.4,214.5 C185.4,234.39 173.97,247.35 155.52,247.35 Z M248.67,246 L248.67,183 L233.37,183 L233.37,201.09 L233.73,220.62 L209.7,183 L195.3,183 L195.3,246 L210.6,246 L210.6,228 L210.24,208.47 L234.27,246 L248.67,246 Z", :id "SOON", :fill "#000000"}]
  [:polygon {:id "arrow", :fill "#000000", :points "1.77257246 43.1758585 1.56806884 105.209907 160.808858 106.005735 161.007574 147.930905 251.122284 73.6507553 161.676069 0.689268387 161.676069 42.6207559"}]]]]
    [:div.footer "Copyright 2017 VisionQ"]]
   [:div.light "light"]])

(defn init []
  (rum/mount (label) (. js/document (getElementById "container"))))
