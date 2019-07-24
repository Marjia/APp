package com.terrestrialit.ltd.terrestrialit;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class ServicesActivity extends ToolbarClass {

//    String[] ChocolateOneTitleStr={
//            "SOFTWARE DEVELOPMENT",
//            "MOBILE APPS DEVELOPMENT",
//            "WEB DEVELOPMENT",
//            "WEB DESIGNING",
//            "E-COMMERCE SHOPPING CART",
//            "SEARCH ENGINE OPTIMIZATION",
//            "SOCIAL MEDIA MARKETING",
//            "E-MAIL MARKETING",
//            "ADVERTISING & MARKETING",
//            "LOGO DESIGNING",
//            "Brochure Designing",
//            "IT Training"};
//    String[] ChocolateOneDetailStr={
//
//            "We develop software solutions, ranging from specific modules and components, to complete, large and complex solutions, which include training, support and global implementation. We understand the diverse commercial needs of modern businesses and how custom built software can be used to improve performance and profits. We can provide you our development services whether you need custom programming of existing facilities or the creation of new software based products. Starting with a review of your current business process, we develop software solutions that integrate seamlessly with any existing systems and rapidly enhance your potential to perform",
//
//
//            "Terrestrial IT is able to develop Mobile Apps that enable your clients to engage with you at their convenience. These Mobile Apps help add value to your products and services, with latest information, best offers, sources and routes of contact, and entertainment. They give you the best of modern information technology ideally suited to your special needs.Terrestrial IT has an abundance of knowledge, skills and experience combined with creativity in Mobile Apps development, to serve your business. Our work covers all ranges of Mobile App needs focused on techno-creativity to best increase your business potential, in a very competitive field.",
//
//
//            "Terrestrial IT has mastered the skills to offer for internet solutions to improve business performance. We have the knowledge, experience and understanding to plan creative and relevant solutions for your needs, to take the correct message to your target audience. We undertake all functions related to web development, with abundant experience in helping companies to increase their corporate potential through the Internet, helping them to methodically expand their scope of business. Terrestrial IT web based systems are based on the most modern technologies and platforms that offer our clientele the best security and user friendly operations. We also provide web based tools for Reservation Systems, Media Centers, Task Management Systems, Mobile Applications and a wide range of other services.",
//
//            "We design websites for your business, to make it more practical and acceptable to the world. We handle your needs related to web design, utilizing the latest technology, to provide innovative, creative, high quality, professional websites. We have a proud record of developing professional websites to satisfied clients, enabling the rapid expansion of our clientele. While presenting a modern up-to-date image of your company, we facilitate in providing all services to launch a result oriented corporate website. Having identified your needs, our team will readily provide the best services, with the latest technologies in web design and function.We also go beyond to undertake domain registration and web hosting, and other facilities such as SEO services, Logo Designs, E-marketing etc.",
//
//            "Terrestrial IT presents a comprehensive e-Commerce Shopping Cart solution to meet every aspect of your business needs. Online ordering, sales of products and services, and updating of stock inventory gets priority. The availability of an e-Commerce Shopping Cart solution, with the assurance of a secured payment gateway, gives your clients and web users, easy access to knowledge of your products via the World Wide Web, for ready online purchase. The Shopping Cart solution as presented by Terrestrial IT, is favored in many countries due to ease of use, widest range of product categories, use of multiple currencies, ability to localize facility through multiple languages, helps to target specific countries, and very importantly maintain stock inventories and sales orders with complete ease.",
//
//            "Terrestrial IT offers a broad area of Search Engine Optimization services, to improve the visibility and performance of one’s website. Our ability to recognize and address these factors lead to improve search engine ranking and internet traffic. The promise to our clients is to enhance and reach of their websites the highest position in the relevant search engines, with the assurance of long lasting, ready to spend traffic over sustained periods of time. Our team has brought 100% customer satisfaction through customized SEO services.",
//
//            "We provide most effective Social Media Applications making it easier for you to interact with your present and would be customers. Terrestrial IT develops product and service focused Social Media Applications that make good connections with important community platforms such as Facebook, Twitter, LinkedIn, Google, and rapidly growing Blogs, Forums, Networking, Audio and Video Bookmarking etc. Our applications are focused on the reach and relevance of the social media platform and target market. These could include quizzes, games, and surveys that attract visitors, review logs, or scaled down applications such as facebook hosted reservation systems, shopping carts and calendars.",
//
//            "Terrestrial IT will increase your sales through e-mail reach to a very large audience. We create well focused e-mail flyers to registered recipients, with ready expansion of recipients. Our current e-mail reach covers more than 500,000 institutions and persons, and rapidly expanding based on knowledge of client needs and services. We send e-mail flyers to any select group identified according to profession – Doctors/ Lawyers/ IT Professions/ Accountants, etc., and both established and up-and coming companies. Our e-mail services use eBM (email Bulk Machine). This specializes in the best and most reliable use of e-mail, with the special feature of preventing spam rejection. We offer a 100 % guarantee of safe and secure messages, set at speed.",
//
//            "Terrestrial IT has a niche in the field of Mobile Advertising. We use the best of connectivity through phone and the Internet to take your message to the widest reach. We go beyond the scope of the mobile phone, using the facilities of the e-SMS Machine – for Bulk SMS Messages that score on speed and reach. Terrestrial IT staff in Advertising & Marketing can offer you the widest range of outreach with the best design and quality in the widest range of marketing tools. We give you quality in design and content in items from Visiting Cards, Posters, and Cutouts, to Book Covers, Magazines, Company Profiles etc., with a commitment to serve your needs. Our search, with you is for the design to best convey your message. It is a combined with the best of skills in design and creativity, and your own inputs through knowledge of your own business and market.",
//
//            "Terrestrial IT understands your business and designs its logo to represent your unique business and marketing message.Logo designing is a comprehensive process, beginning with business briefing, and moving on to the creative skills of knowledgeable and skilled logo designers, who best understand both the art and craft of the logo. Our logo designs ensure your business, product or service a “stand out” position, attracting customers with emotion and business focus. The designs have a memory impact, and are well remembered. High logo quality attracts the right customers to a business, lending a distinction of the best standards in products and services. We see logo design as a cooperative effort with our clients, helping you achieve your best expectations of design and impact. Our specialists in each logo design project are tireless in the search, with you, for the best design and memorable logo for you.",
//
//            "Terrestrial IT has the focus on creativity in the design and presentation of your brochures – carrying your special business message. From the thorough business brief and the understanding of your current and expected reach, our brochure designers who have specialized skills in creative presentation, will present challenging designs – with combinations of emotion and practicality. We see the brochure as the special colorful and persuasive message from your business, product or service. It will have art in its many attractive variations and the best of design skills, as well as text that will blend with design for best impact. The brochure is another shared work with the client and designer, with the encouragement of interaction to bring the best results for you.",
//
//            "Terrestrial IT provide quality training facility of various department of ICT. Specially we makes non IT background students making expert of an specific topic of ICT such as Web, Graphics or SEO. Our Trainers are highly qualified and well presenter to keep motivated and interested our trainee to this sector. Specially we enforce for working with Real life projects and also Ensure the problem solving skills to make him self depended in his own platform"
//    };
//
//    ListView ChocolateOneListView;


    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        String title="Services";
        ToolbarMethod(title);

//        AdapterSettingChocolate();
        TabLayoutMethod();
    }

    public void TabLayoutMethod(){

//
//        toolbar=(Toolbar)findViewById(R.id.toolbar_id);
//        setSupportActionBar(toolbar);


        //initialize viePager object
        viewPager =(ViewPager)findViewById(R.id.viewpager_id);

        //Create veiwPager  adapter
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());


        //adding fragment classes to adapter object which use methos addFragment , it add item fragment
        // and title into FragmentList and FragmentTitleList
        //string act as title
        adapter.addFragment(new ServiceFragment(),"Services");
        adapter.addFragment(new WebDesignFragment(),"Web Design");
        adapter.addFragment(new SEOFragment(),"SEO");
        adapter.addFragment(new SMMFragment(),"Smm");
        adapter.addFragment(new ContentWritingFragment(),"Content Writing");
        adapter.addFragment(new EcommerceFragment(),"ECommerce");
        adapter.addFragment(new AppsDevelopmentFragment(),"Apps Development");


        //adding adapter object to viewpager object
        viewPager.setAdapter(adapter);

        //initialize tablayout object
        tabLayout =(TabLayout)findViewById(R.id.tablayout_id);
        tabLayout.setupWithViewPager(viewPager);

    }

//    public void AdapterSettingChocolate(){
//
//        ChocolateOneListView=(ListView)findViewById(R.id.chocolate_one_listview_id);
//        ServicesCustomAdapter chOnAdapter=new ServicesCustomAdapter(getApplicationContext(),ChocolateOneTitleStr,ChocolateOneDetailStr);
//
//        ChocolateOneListView.setAdapter(chOnAdapter);
//        ChocolateOneListView.setFocusable(false);
//    }
}
