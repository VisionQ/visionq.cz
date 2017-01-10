(ns visionq.styles
  (:require [garden.def :refer [defrule defstyles defkeyframes]]
            [garden.stylesheet :refer [rule]]))

(defkeyframes slide-right
  [:0% {:transform "translateX(0)"}]
  [:20% {:transform "translateX(0)"
         :opacity 1}]
  [:50% {:transform "translateX(35vw)"
         :opacity 0}]
  [:69.999999% {:transform "translateX(35vw)"
           :opacity 0}]
  [:70% {:transform "translateX(0)"}]
  [:98% {:opacity 0}]
  [:100% {:opacity 1}])

(defstyles screen
  slide-right

  [:body
   {:font-family "Vegan Sans"
    :font-size   "16px"
    :line-height 1.5
    :margin 0
    :padding 0}
   [:div#container
    [:&>div
     {:display :flex
      :flex-direction :row
      :width "100vw"}
     [:&>div
      {:height "100vh"}
      [:&.darkness
       {:background "black"
        :width "30vw"}]
      [:&.twilight
       {:background "lightgrey"
        :color "lightgrey"
        :width "65rem !important"
        :display :flex
        :flex-direction :column
        :align-items :center
        :justify-content :space-between}
       [:&>.soon
        {:animation [[slide-right "7s" :infinite :ease-in :forwards]]}]
       [:&>.footer
        {:text-align :center
         :font-size "0.75rem"
         :margin-bottom "1vh"
         :color "black"}]]
      [:&.light
       {:background "white"
        :color "white"
        :width "30vw"}]]]]])
